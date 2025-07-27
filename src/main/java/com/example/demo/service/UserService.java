/**
 * ユーザー情報のビジネスロジックを処理するサービスクラス。
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@Service
public class UserService {

	private final UserMapper userMapper;

	public UserService(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public List<User> getUsersOver50() {
		return userMapper.selectUsersOver50();
	}

	public List<User> getAllUsers() {
		return userMapper.selectAllUsers();
	}

	public void deleteUser(Long id) {
		userMapper.deleteUser(id);
	}

	public int updateUser(User user) {
		return userMapper.updateUser(user);
	}

	public void insertUser(User user) {
		userMapper.insertUser(user);
	}
}
