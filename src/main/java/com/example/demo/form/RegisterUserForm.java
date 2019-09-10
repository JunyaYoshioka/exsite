package com.example.demo.form;

import javax.validation.constraints.NotBlank;

public class RegisterUserForm {
	
	/** 名前 */
	@NotBlank(message = "名前を入力してください")
	private String name;
	/** メール */
	@NotBlank(message = "メールアドレスを入力してください")
	private String email;
	/** パスワード */
	@NotBlank(message = "パスワードを入力してください")
	private String password;
	/** 郵便番号 */
	@NotBlank(message = "郵便番号を入力してくださいい")
	private String zipcode;
	/** 住所 */
	@NotBlank(message = "住所を入力してください")
	private String address;
	/** 電話番号 */
	@NotBlank(message = "電話番号を入力してください")
	private String telephone;
	/** 確認用のパスワード */
	@NotBlank(message = "確認用パスワードを入力してください")
	private String inputConfirmationPassword;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getInputConfirmationPassword() {
		return inputConfirmationPassword;
	}
	public void setInputConfirmationPassword(String inputConfirmationPassword) {
		this.inputConfirmationPassword = inputConfirmationPassword;
	}
	@Override
	public String toString() {
		return "RegisterUserForm [name=" + name + ", email=" + email + ", password=" + password + ", zipcode=" + zipcode
				+ ", address=" + address + ", telephone=" + telephone + ", inputConfirmationPassword="
				+ inputConfirmationPassword + ", getName()=" + getName() + ", getEmail()=" + getEmail()
				+ ", getPassword()=" + getPassword() + ", getZipcode()=" + getZipcode() + ", getAddress()="
				+ getAddress() + ", getTelephone()=" + getTelephone() + ", getInputConfirmationPassword()="
				+ getInputConfirmationPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
