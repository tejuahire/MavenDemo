package com.example.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

	@Query("from Alien where aname=:name")
	List<Alien> findbyname(@Param("name")String aname);



}
