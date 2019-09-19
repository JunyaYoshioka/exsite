package com.example.demo.repository;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Order;

@Repository
public class OrderRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<Order> ORDER_ROW_MAPPER = (rs,i) ->{
        Order order = new Order();
        order.setId(rs.getInt("id"));
        order.setUserId(rs.getInt("user_id"));
        order.setStatus(rs.getInt("status"));
        order.setTotalPrice(rs.getInt("total_price"));
        order.setOrderDate(rs.getDate("order_date"));
        order.setDesinationName(rs.getString("destination_name"));
        order.setDesinationEmail(rs.getString("destination_email"));
        order.setDesinationZipcode(rs.getString("destination_zipcode"));
        order.setDesinationAddress(rs.getString("destination_address"));
        order.setDesinationTel(rs.getString("destination_tel"));
        order.setDeliveryTime(rs.getTimestamp("delivery_time"));
        order.setPaymentMethod(rs.getInt("payment_method"));
        return order;
    };
	

	/**
	 * 
	 * @param userId
	 * @param status
	 * @return
	 */
	public List<Order> findOrderByuserAndStatus(Integer userId, Integer status){
		String sql = "SELECT id,user_id,status,total_price,order_date,destination_name,destination_email,destination_zipcode,destination_address,destination_tel,delivery_time,payment_method From orders WHERE user_id = :userId AND status = :status;";
		
		SqlParameterSource param = new MapSqlParameterSource().addValue("userId", userId).addValue("status", status);
		
		List<Order> orderList = template.query(sql, param, ORDER_ROW_MAPPER);
		
		return orderList;
	}
	
	private SimpleJdbcInsert insert;
	
	// 自動採番取得用メソッド
    @PostConstruct
    public void init() {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert((JdbcTemplate) template.getJdbcOperations());
        SimpleJdbcInsert withTableName = simpleJdbcInsert.withTableName("orders");
        insert = withTableName.usingGeneratedKeyColumns("id");
    }
    
    /**
     * オーダーテーブルにインサートする.
     * 自動採番を取得する
     *
     * @param order
     * @return　自動採番のIDを返す
     */
    public Order insert(Order order) {
        // ドメインの名前とSQLの？部分があっていれば自動的に入っていく
        SqlParameterSource param = new BeanPropertySqlParameterSource(order);
        // executeAndReturnKeyが勝手にインサート文を実行してくれる
        Number key = insert.executeAndReturnKey(param);
        order.setId(key.intValue());
        return order;
    }
	
	
}
