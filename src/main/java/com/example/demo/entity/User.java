/**
 * ユーザー情報を表すエンティティクラス。
 * 対応テーブル：users
 */
package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

	@Id
	private Long id;

	private String name;
	private String email;
	private Integer age;
	private String blood;
}
