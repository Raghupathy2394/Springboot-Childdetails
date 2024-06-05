package com.example.Child.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Child.Entity.Child;
import com.example.Child.service.ChildServiceImp;

@RestController
@RequestMapping("/childd")
public class ChildController {

	@Autowired
	ChildServiceImp childservice;

	@PostMapping("/post")
	public Child create(@RequestBody Child child) {
		return childservice.create(child);
	}

	@PostMapping("/postall")
	public List<Child> createall(@RequestBody List<Child> childall) {
		return childservice.createall(childall);
	}
	

	@GetMapping("/get/{id}")
	public Optional<Child> getdetail(@PathVariable int id) {
		Optional<Child> child = childservice.getdetail(id);
		return child;
	}

	@GetMapping("/getall")
	public List<Child> getall() {
		return childservice.getall();
	}

	@PutMapping("/put")
	public Child update(@RequestBody Child child) {
		return childservice.update(child);
	}

	@PutMapping("/putall")
	public List<Child> updateall(@RequestBody List<Child> childall) {
		return childservice.updateall(childall);
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return childservice.delete(id);
	}

	@DeleteMapping("/deleteall")
	public String deleteall() {
		return childservice.deleteall();
	}
}
