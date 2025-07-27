//package com.example.demo.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class DataSourceConfig {
//
//    @Bean
//    public DataSource dataSource() {
//        String url = "jdbc:postgresql://localhost:5432/" + EnvConfig.get("DB_NAME");
//        return DataSourceBuilder.create()
//                .url(url)
//                .username(EnvConfig.get("DB_USERNAME"))
//                .password(EnvConfig.get("DB_PASSWORD"))
//                .driverClassName("org.postgresql.Driver")
//                .build();
//    }
//}
