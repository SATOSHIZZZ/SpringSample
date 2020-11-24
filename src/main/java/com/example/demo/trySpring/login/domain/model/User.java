package com.example.demo.trySpring.login.domain.model;

import java.util.Date;

import lombok.Data;

@Data
public class User {

	private String userId;//ユーザーID
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMarriage() {
		return marriage;
	}
	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	private String password;//パスワード
	private String userName;//ユーザー名ｒ
	private Date birthday;//誕生日
	private int age;//年齢
	private boolean marriage;//結婚ステータス
	private String role;//ロール
}