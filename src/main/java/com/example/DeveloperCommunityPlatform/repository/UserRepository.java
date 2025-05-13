package com.example.DeveloperCommunityPlatform.repository;

import com.example.DeveloperCommunityPlatform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
