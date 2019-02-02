package com.zhengyuan.liunao.entity;

public class Teacher {
	private int id;
	private String num;
	private String name;
	private String psw;
	private String sex;
	private String phone;
	private String qq;
	private String photo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Teacher(int id, String num, String name, String psw, String sex, String phone, String qq, String photo) {
		super();
		this.id = id;
		this.num = num;
		this.name = name;
		this.psw = psw;
		this.sex = sex;
		this.phone = phone;
		this.qq = qq;
		this.photo = photo;
	}

	public Teacher() {
		super();
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", num=" + num + ", name=" + name + ", psw=" + psw + ", sex=" + sex + ", phone="
				+ phone + ", qq=" + qq + ", photo=" + photo + "]";
	}

}
