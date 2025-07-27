/**
 * ユーザー情報のDTO（Data Transfer Object）クラス。
 */
package com.example.demo.dto;

import lombok.Data;

@Data
public class UserDto {
	private Long id;
	private String name;
	private String email;
	private Integer age;
	private String blood;
}
