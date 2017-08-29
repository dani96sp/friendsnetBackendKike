package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.everis.alicante.courses.beca.summer17.friendsnet.enums.LikeType;

import lombok.Data;

@Data
@Entity
@Table(name = "likeTable")
public class Like implements FNEntity {

	// Definition of variables of the entity Person
	@Id
	@Column(name = "likeid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idlike;

	private Date creationDate;
	
	@Enumerated(EnumType.STRING)
	private LikeType type;

	@ManyToOne
	@JoinColumn(name = "personid")
	private Person likesPerPerson;

	@ManyToOne
	@JoinColumn(name = "postid")
	private Post likesPerPost;

}
