package com.example.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class AlienDao {
	@Autowired
	private SessionFactory session;
	@Transactional
public List<Alien> getAliens(){
	Session sess=session.getCurrentSession();
	List<Alien> aliens=sess.createQuery("from Alien", Alien.class).list();
	return aliens;
	
}
}
