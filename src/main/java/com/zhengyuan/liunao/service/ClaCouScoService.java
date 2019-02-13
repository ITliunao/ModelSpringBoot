package com.zhengyuan.liunao.service;

import java.util.List;

import com.zhengyuan.liunao.entity.ClaCouSco;

public interface ClaCouScoService {
	public List<ClaCouSco> findStusScores(String gradeid, String classid, String coursename);
}
