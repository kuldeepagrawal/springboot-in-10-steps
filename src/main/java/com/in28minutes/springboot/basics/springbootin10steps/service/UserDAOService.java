package com.in28minutes.springboot.basics.springbootin10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.basics.springbootin10steps.entity.User;

@Repository
@Transactional
public class UserDAOService {
		
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user){
		//Open Transaction
		entityManager.persist(user);
		//Close Transaction
		return user.getId();
	}
}

/*
 * Spring Data JPA
 * 
 * 
 * 
 */