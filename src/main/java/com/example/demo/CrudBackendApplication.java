/**
 * Spring Boot アプリケーションのエントリーポイント。
 * アプリ全体を起動します。
 */
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudBackendApplication {
	public static void main(String[] args) {
//		// .env の読み込み
//		Dotenv dotenv = Dotenv.configure()
//			.ignoreIfMissing()  // .env がないときも無視して続行
//			.load();
//
//		// .env の内容をシステムプロパティに設定（Spring が参照できるように）
//		dotenv.entries().forEach(entry ->
//			System.setProperty(entry.getKey(), entry.getValue())
//		);

		// Spring Boot アプリ起動
		SpringApplication.run(CrudBackendApplication.class, args);
	}
}
