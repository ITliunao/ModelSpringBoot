package com.zhengyuan.liunao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.zhengyuan.liunao.entity.Stu;

@Mapper
public interface StuMapper {

	public int addStu(Map map);

	public List<Stu> findStu(String num, String psw);

	public List<Stu> findAllStu(Map<String, Object> map);

	public List<Stu> findAll();

	public List<Stu> findStuByName(String name, int start, int pagesize);

	public int stuCount();

	public List<Stu> echartStu();

	public int deleteByForeach(List<String> stuNo);

	public int deleteStu(String stuNo);

	public List<Stu> getStuByNum(String num);

	public int updateStu(Map map);
}
