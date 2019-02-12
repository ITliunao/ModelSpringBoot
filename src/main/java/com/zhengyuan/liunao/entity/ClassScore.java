package com.zhengyuan.liunao.entity;

public class ClassScore {
	private String num;
	private String name;
	private String score;

	public ClassScore() {
		super();
	}

	public ClassScore(String num, String name, String score) {
		super();
		this.num = num;
		this.name = name;
		this.score = score;
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

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "ClassScore [num=" + num + ", name=" + name + ", score=" + score + "]";
	}

}
