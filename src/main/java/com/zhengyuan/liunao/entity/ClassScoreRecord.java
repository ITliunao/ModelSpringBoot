package com.zhengyuan.liunao.entity;

public class ClassScoreRecord {
	private String num;
	private String name;
	private float score1;
	private float score2;
	private float score3;

	public ClassScoreRecord() {
		super();
	}

	public ClassScoreRecord(String num, String name, float score1, float score2, float score3) {
		super();
		this.num = num;
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
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

	public float getScore1() {
		return score1;
	}

	public void setScore1(float score1) {
		this.score1 = score1;
	}

	public float getScore2() {
		return score2;
	}

	public void setScore2(float score2) {
		this.score2 = score2;
	}

	public float getScore3() {
		return score3;
	}

	public void setScore3(float score3) {
		this.score3 = score3;
	}

	@Override
	public String toString() {
		return "ClassScoreRecord [num=" + num + ", name=" + name + ", score1=" + score1 + ", score2=" + score2
				+ ", score3=" + score3 + "]";
	}

}
