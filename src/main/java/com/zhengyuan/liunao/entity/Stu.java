package com.zhengyuan.liunao.entity;

public class Stu {
	private int id;
	private String num;
	private String psw;
	private String name;
	private String sex;
	private String phone;
	private String photo;
	private String qq;
	private String classid;
	private String gradeid;

	public Stu(int id, String num, String psw, String name, String sex, String phone, String photo, String qq,
			String classid, String gradeid) {
		super();
		this.id = id;
		this.num = num;
		this.psw = psw;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.photo = photo;
		this.qq = qq;
		this.classid = classid;
		this.gradeid = gradeid;
	}

	public Stu() {
		super();
	}

	public Stu(String num, String psw) {
		super();
		this.num = num;
		this.psw = psw;
	}

	public Stu(String num, String psw, String name, String sex, String phone, String photo, String qq, String classid,
			String gradeid) {
		super();
		this.num = num;
		this.psw = psw;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.photo = photo;
		this.qq = qq;
		this.classid = classid;
		this.gradeid = gradeid;
	}

	@Override
	public String toString() {
		return "Stu [id=" + id + ", num=" + num + ", psw=" + psw + ", name=" + name + ", sex=" + sex + ", phone="
				+ phone + ", photo=" + photo + ", qq=" + qq + ", classid=" + classid + ", gradeid=" + gradeid + "]";
	}

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

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getClassid() {
		return classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}

	public String getGradeid() {
		return gradeid;
	}

	public void setGradeid(String gradeid) {
		this.gradeid = gradeid;
	}

}
