package com.zhengyuan.liunao.entity;

public class User {
	private int id;
	private String account;
	private String psw;
	private String name;
	private int type;

	public User() {
		super();
	}

	public User(String account, String psw) {
		super();
		this.account = account;
		this.psw = psw;
	}

	public User(int id, String account, String psw, String name, int type) {
		super();
		this.id = id;
		this.account = account;
		this.psw = psw;
		this.name = name;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", account=" + account + ", psw=" + psw + ", name=" + name + ", type=" + type + "]";
	}

}
