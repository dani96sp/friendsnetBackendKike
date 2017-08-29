package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.everis.alicante.courses.beca.summer17.friendsnet.enums.EventType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "eventTable")
public class Event implements FNEntity {

	// Definition of variables of the entity Person
	@Id
	@Column(name = "eventid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idevent;

	private String name;

	private Date startingDate;

	private Date endingDate;

	@Enumerated(EnumType.STRING)
	private EventType type;

	private Byte[] picture;

	@ManyToMany
	@JoinColumn(name = "personid")
	@JsonIgnore
	private Set<Person> personsPerEvent;

	@OneToMany
	@JsonIgnore
	private Set<Post> posts;

}
