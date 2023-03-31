package com.toby.spring;

import com.toby.spring.dao.UserDao;
import com.toby.spring.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SpringApplication.run(Application.class, args);

		UserDao userDao = new UserDao();

		User user = new User();
		user.setId("testId");
		user.setName("testName");
		user.setPassword("1234");

		userDao.add(user);
		System.out.println(user.getId() + "등록 성공");

	}

}
