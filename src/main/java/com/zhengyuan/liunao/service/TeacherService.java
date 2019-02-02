package com.zhengyuan.liunao.service;

import java.util.List;
import java.util.Map;

import com.zhengyuan.liunao.entity.Teacher;

public interface TeacherService {
	public int addTeacher(Map map);

	public List<Teacher> findTeacher(String num, String psw);

	public List<Teacher> findAllTeacher(Map<String, Object> map);

	public List<Teacher> findTeacherByName(String name, int start, int pagesize);

	public int teacherCount();
}
