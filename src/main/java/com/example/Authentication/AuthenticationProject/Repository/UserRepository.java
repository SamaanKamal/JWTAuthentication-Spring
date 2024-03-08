package com.example.Authentication.AuthenticationProject.Repository;

import com.example.Authentication.AuthenticationProject.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Integer> {
}
