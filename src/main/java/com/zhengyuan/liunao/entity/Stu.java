package com.zhengyuan.liunao.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class Stu {
	private int id;
	@Excel(name = "学生学号", height = 20, width = 30)
	private String num;
	private String psw;
	@Excel(name = "学生姓名", height = 20, width = 30)
	private String name;
	@Excel(name = "学生性别", height = 20, width = 30)
	private String sex;
	@Excel(name = "学生电话", height = 20, width = 30)
	private String phone;
	@Excel(name = "学生头像", type = 2, width = 40, height = 20, imageType = 1)
	private String photo;
	@Excel(name = "学生qq", height = 20, width = 30)
	private String qq;
	@Excel(name = "学生班级", height = 20, width = 30)
	private String classid;
	@Excel(name = "学生年级", height = 20, width = 30)
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
