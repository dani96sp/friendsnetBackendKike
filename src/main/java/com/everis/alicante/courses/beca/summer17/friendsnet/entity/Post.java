package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.everis.alicante.courses.beca.summer17.friendsnet.enums.PostType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "postTable")
public class Post implements FNEntity {

	// Definition of variables of the entity Person
	@Id
	@Column(name = "postid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idpost;

	private String text;

	private Date creationDate;

	@Enumerated(EnumType.STRING)
	private PostType type;

	private Byte[] picture;

	@ManyToOne
	@JoinColumn(name = "personid")
	private Person postsPerPerson;

	@ManyToOne
	@JoinColumn(name = "eventid")
	private Event event;

	@OneToMany(mappedBy = "likesPerPost", cascade = {CascadeType.ALL})
	@JsonIgnore
	private Set<Like> likes;

}
