package com.zhengyuan.liunao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.zhengyuan.liunao.entity.Teacher;

@Mapper
public interface TeacherMapper {
	public int addTeacher(Map map);

	public List<Teacher> findTeacher(String num, String psw);

	public List<Teacher> findAllTeacher(Map<String, Object> map);

	public List<Teacher> findTeacherByName(String name, int start, int pagesize);

	public int teacherCount();

}
