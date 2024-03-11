package com.oasis.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oasis.Course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
