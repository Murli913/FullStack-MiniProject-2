package com.codewithmurli.fullstackbackend.repository;

import com.codewithmurli.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
