package com.example.Child.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Child.Entity.Child;
import com.example.Child.Repository.ChildRepository;

@Service
public class ChildService implements ChildServiceImp {

	@Autowired
	ChildRepository childRepository;
@Override
public Child create(Child child) {
	return childRepository.save(child);
}
public List<Child> createall(List<Child> childall){
	return childRepository.saveAll(childall);
}
@Override
public Optional<Child> getdetail(int id) {
	return childRepository.findById(id);
}
@Override
public List<Child> getall() {
	return childRepository.findAll();
	}
@Override
public Child update(Child child) {
	Optional<Child> child1=childRepository.findById(child.getId());
	Child child2=child1.get();
	child2.setName(child.getName());
return childRepository.save(child2);
	
}


}


