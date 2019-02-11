package com.zhengyuan.liunao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zhengyuan.liunao.entity.ClassScore;

@Mapper
public interface ClassScoreMapper {
	public List<ClassScore> findClassScore(String gradeid, String classid);
}
