package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "personTable")
public class Person implements FNEntity {

	// Definition of variables of the entity Person
	@Id
	@Column(name = "personid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idperson;

	private String name;

	private String surname;

	private Byte[] picture;

	@ManyToMany
	@JoinTable(name = "friends", joinColumns = @JoinColumn(name = "personId"), inverseJoinColumns = @JoinColumn(name = "friendId"))
	private final Set<Person> friends = new HashSet<>();

	@ManyToMany
	@JoinTable(name = "friends", joinColumns = @JoinColumn(name = "friendId"), inverseJoinColumns = @JoinColumn(name = "personId"))
	@Getter
	@Setter
	private Set<Person> newFriends;

	@ManyToMany(mappedBy = "personsPerGroup")
	@JsonIgnore
	private Set<Group> groups;

	@OneToMany(mappedBy = "likesPerPerson")
	@JsonIgnore
	private Set<Like> likes;

	@OneToMany(mappedBy = "postsPerPerson")
	@JsonIgnore
	private Set<Post> posts;

	@ManyToMany(mappedBy = "personsPerEvent")
	@JsonIgnore
	private Set<Event> events;

}
