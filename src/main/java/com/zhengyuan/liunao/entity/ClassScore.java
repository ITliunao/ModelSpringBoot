package com.zhengyuan.liunao.entity;

public class ClassScore {
	private String num;
	private String name;
	private String coursename;
	private float scores;

	public ClassScore() {
		super();
	}

	public ClassScore(String num, String name, String coursename, float scores) {
		super();
		this.num = num;
		this.name = name;
		this.coursename = coursename;
		this.scores = scores;
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

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public float getScores() {
		return scores;
	}

	public void setScores(float scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "ClassScore [num=" + num + ", name=" + name + ", coursename=" + coursename + ", scores=" + scores + "]";
	}

}
