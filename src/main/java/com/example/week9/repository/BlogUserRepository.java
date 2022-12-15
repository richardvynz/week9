package com.example.week9.repository;

import com.example.week9.models.BlogUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Repository
public interface BlogUserRepository extends JpaRepository<BlogUser,Long> {
 Optional<BlogUser>findBlogUserByEmailAndPassword(String email,String password);
}
