package com.zhengyuan.liunao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zhengyuan.liunao.entity.ClaCouSco;

@Mapper
public interface ClaCouScoMapper {
	public List<ClaCouSco> findStusScores(String gradeid, String classid, String coursename);
}
