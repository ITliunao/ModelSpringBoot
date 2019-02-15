package com.zhengyuan.liunao.entity;

public class ClaCouTea {
	public String num;
	public String teacher;
	public String info;

	public ClaCouTea() {
		super();
	}

	public ClaCouTea(String num, String teacher, String info) {
		super();
		this.num = num;
		this.teacher = teacher;
		this.info = info;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "ClaCouTea [num=" + num + ", teacher=" + teacher + ", info=" + info + "]";
	}

}
