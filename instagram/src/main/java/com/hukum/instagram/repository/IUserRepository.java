package com.hukum.instagram.repository;

import com.hukum.instagram.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {
}
