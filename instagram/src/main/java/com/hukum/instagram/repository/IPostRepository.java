package com.hukum.instagram.repository;

import com.hukum.instagram.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepository extends JpaRepository<Post,Integer> {
}
