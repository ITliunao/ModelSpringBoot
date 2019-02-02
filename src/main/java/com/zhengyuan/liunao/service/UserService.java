package com.zhengyuan.liunao.service;

import java.util.List;

import com.zhengyuan.liunao.entity.User;

public interface UserService {
	public List<User> findUser(String account, String psw);
}
