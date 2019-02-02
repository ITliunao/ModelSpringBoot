package com.zhengyuan.liunao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zhengyuan.liunao.entity.User;

@Mapper
public interface UserMapper {
	public List<User> findUser(String account, String psw);
}
