/**
 * MyBatis用のユーザーマッパーインターフェース。
 * SQL文はresourcesのXMLファイルで定義される。
 */
package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.User;

@Mapper
public interface UserMapper {

	List<User> selectUsersOver50();

	List<User> selectAllUsers();

	void deleteUser(Long id);

	int updateUser(User user);

	void insertUser(User user);
}
