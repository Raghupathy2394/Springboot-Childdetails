package com.example.Child.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "children")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Child {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "gender")
	private String gender;

	@OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name="fk_aid") //address aid
	 private Address address;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="fk_id",referencedColumnName = "id")
//	private List<Address> address; 
}
