package com.sap.learning.jpa.jpalearning.repository;

import com.sap.learning.jpa.jpalearning.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
