package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Users;
public interface UserRepository extends JpaRepository<Users,Long>
{

 public boolean existsByEmail(String email);
 public Users getByEmail(String email);



}
