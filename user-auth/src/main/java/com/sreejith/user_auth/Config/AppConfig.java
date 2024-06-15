package com.sreejith.user_auth.Config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "com.sreejith.user_auth.Service")
@EnableJpaRepositories(basePackages = "com.sreejith.user_auth.Repository")
@EntityScan(basePackages = "com.sreejith.user_auth.Entity")
public class AppConfig {
}
