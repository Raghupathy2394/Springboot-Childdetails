package com.example.Child.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Child.Entity.Child;

@Repository
public interface ChildRepository extends JpaRepository<Child, Integer>{

}
