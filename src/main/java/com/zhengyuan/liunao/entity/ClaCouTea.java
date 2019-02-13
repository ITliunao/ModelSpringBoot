package com.zhengyuan.liunao.entity;

public class ClaCouTea {
	public String gradeName;
	public String className;
	public String courseName;
	public String teacher;

	public ClaCouTea() {
		super();
	}

	public ClaCouTea(String gradeName, String className, String courseName, String teacher) {
		super();
		this.gradeName = gradeName;
		this.className = className;
		this.courseName = courseName;
		this.teacher = teacher;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "ClaCouTea [gradeName=" + gradeName + ", className=" + className + ", courseName=" + courseName
				+ ", teacher=" + teacher + "]";
	}

}
