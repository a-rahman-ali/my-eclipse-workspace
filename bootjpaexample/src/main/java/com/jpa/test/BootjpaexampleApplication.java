package com.jpa.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

//		Saving single user

//		User user = new User();
//		user.setName("Khan");
//		user.setCity("Knl");
//		user.setState("Andhra Pradesh");
//
//		User savedUser = userRepository.save(user);
//		System.out.println(savedUser);

//		Saving multiple users
//		User user1 = new User();
//		user1.setName("ankit");
//		user1.setCity("pune");
//		user1.setState("MH");
//
//		User user2 = new User();
//		user2.setName("periyar");
//		user2.setCity("chennai");
//		user2.setState("TN");
//
//		List<User> users = List.of(user1, user2);
//		Iterable<User> savedUsers = userRepository.saveAll(users);
//		savedUsers.forEach(user -> System.out.println(user));

//		Updating User with id 1
//		Optional<User> optional = userRepository.findById(1);
//		User user = optional.get();
//		System.out.println(user);
//		user.setName("ARahman");
//		User updatedUser = userRepository.save(user);
//		System.out.println(updatedUser);

//		Get all data
//		Iterable<User> users = userRepository.findAll();
//		users.forEach(user -> System.out.println(user));

//		Get data by id
//		Optional<User> optional = userRepository.findById(102);
//		User user = optional.get();
//		System.out.println(user);

//		Deleting by id
//		userRepository.deleteById(102);
//		System.out.println("deleted");

//		Custom Finder Methods
//		List<User> users = userRepository.findByName("ali");
//		users.forEach(user -> System.out.println(user));

//		List<User> users = userRepository.findByCity("Knl");
//		users.forEach(user -> System.out.println(user));

//		List<User> users = userRepository.findByNameAndCity("Khan", "Knl");
		List<User> users = userRepository.findByNameAndCity("Ali", "Hyd");
		users.forEach(user -> System.out.println(user));

	}

}
