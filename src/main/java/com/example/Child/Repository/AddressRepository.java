package com.example.Child.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Child.Entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
