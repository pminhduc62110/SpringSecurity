package com.example.repository;

import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
	@Query("SELECT u FROM User u WHERE u.email = ?1")
	User findByEmail(String email);

	@Query("SELECT u FROM User u WHERE u.verificationCode = ?1")
	User findByVerificationCode(String verificationCode);
}
