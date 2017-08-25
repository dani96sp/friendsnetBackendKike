package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "person")
public class Person implements FNEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private String surname;

	@Getter
	@Setter
	private byte[] picture;

}
