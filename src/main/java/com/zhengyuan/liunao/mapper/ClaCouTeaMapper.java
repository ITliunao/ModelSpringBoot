package com.zhengyuan.liunao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zhengyuan.liunao.entity.ClaCouTea;

@Mapper
public interface ClaCouTeaMapper {
	public List<ClaCouTea> findCloaCouTea(String gradeid, String classid);
}
