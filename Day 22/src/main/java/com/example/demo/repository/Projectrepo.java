package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modal.Project;
@Repository
public interface Projectrepo extends JpaRepository<Project,Integer>{
	
}

