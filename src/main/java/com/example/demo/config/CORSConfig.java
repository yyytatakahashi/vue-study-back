/**
 * CORS（Cross-Origin Resource Sharing）設定クラス。
 * Vueフロントエンドからのリクエストを許可するための設定を行います。
 */
package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CORSConfig implements WebMvcConfigurer {

	/**
	 * 全てのエンドポイントに対して、特定のオリジンからのアクセスを許可します。
	 *
	 * @param registry CORS設定用のレジストリ
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedOrigins("http://localhost:5173")
				.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
				.allowCredentials(true);
	}
}
