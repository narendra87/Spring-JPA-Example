package com.sap.learning.jpa.jpalearning.service;

import com.sap.learning.jpa.jpalearning.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {
    @PersistenceContext
    private EntityManager entityManager;

    public long insertUser(User user) {
        entityManager.persist(user);
        return user.getId();
    }
}
