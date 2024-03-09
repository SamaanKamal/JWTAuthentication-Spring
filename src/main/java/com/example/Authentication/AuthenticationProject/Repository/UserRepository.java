package com.example.Authentication.AuthenticationProject.Repository;

import com.example.Authentication.AuthenticationProject.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users,Integer> {
    Optional<Users> findByEmail(String email);
}
