/**
 * ユーザー情報のCRUD処理を提供するRESTコントローラー。
 * エンドポイント: /api/users
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	/**
	 * 年齢が50歳以上のユーザーを取得します。
	 * @return ユーザー一覧
	 */
	@GetMapping("/users/over50")
	public List<User> getUsersOver50() {
		return userService.getUsersOver50();
	}

	/**
	 * 全ユーザーを取得します。
	 * @return ユーザー一覧
	 */
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	/**
	 * 指定されたIDのユーザーを削除します。
	 * @param id ユーザーID
	 */
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}

	/**
	 * 指定されたIDのユーザーを更新します。
	 * @param id ユーザーID
	 * @param user 更新するユーザー情報
	 */
	@PutMapping("/users/{id}")
	public void updateUser(@PathVariable Long id, @RequestBody User user) {
		user.setId(id);
		userService.updateUser(user);
	}

	/**
	 * 新しいユーザーを追加します。
	 * @param user 追加するユーザー情報
	 */
	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userService.insertUser(user);
	}
}
