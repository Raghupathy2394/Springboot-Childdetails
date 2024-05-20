package com.example.Child.service;

import java.util.List;
import java.util.Optional;

import com.example.Child.Entity.Child;

public interface ChildServiceImp{

public Child create(Child child);

public List<Child> createall(List<Child> childall);



public Optional<Child> getdetail(int id);

public List<Child> getall();

public Child update(Child child);



	
	
	
}
