package com.zhengyuan.liunao.entity;

public class ClassScoreRecord {
	public String num;
	public String name;
	public String chinese;
	public String math;
	public String english;

	public ClassScoreRecord() {
		super();
	}

	public ClassScoreRecord(String num, String name, String chinese, String math, String english) {
		super();
		this.num = num;
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
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

	public String getchinese() {
		return chinese;
	}

	public void setchinese(String chinese) {
		this.chinese = chinese;
	}

	public String getmath() {
		return math;
	}

	public void setmath(String math) {
		this.math = math;
	}

	public String getenglish() {
		return english;
	}

	public void setenglish(String english) {
		this.english = english;
	}

	@Override
	public String toString() {
		return "ClassScoreRecord [num=" + num + ", name=" + name + ", chinese=" + chinese + ", math=" + math
				+ ", english=" + english + "]";
	}

}
