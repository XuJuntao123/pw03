package yncrea.pw03.config;

import java.util.Properties;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="yncrea.pw03.service")
public class AppConfig {

	public static void main(String[] args) {
		Properties dbProperties = new Properties();
		dbProperties.setProperty("driverClass","com.mysql.jdbc.Driver");
		dbProperties.setProperty("jdbcUrl","jdbc:mysql://localhost:3306/yncrea_pw03");
		dbProperties.setProperty("username","root");
		dbProperties.setProperty("password","root");

    }
}

