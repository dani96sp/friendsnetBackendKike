package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.everis.alicante.courses.beca.summer17.friendsnet.enums.EventType;
import com.everis.alicante.courses.beca.summer17.friendsnet.enums.PostType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "post")
public class Post implements FNEntity {
	@Id
	@Getter
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Getter
	@Setter
	private String text;

	@Getter
	@Setter
	private Date creatingDate;

	@Getter
	@Setter
	private PostType type;
	
	@Getter
	@Setter
	private byte[] picture;

}
