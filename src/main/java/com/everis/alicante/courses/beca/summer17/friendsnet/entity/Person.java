package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "persontable")
public class Person implements FNEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name, surname;
    private byte[] picture;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<PersonGroup> groups;

    @ManyToOne
    private Person parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Person> children;

    public Set<Person> getChildren() {
        if (this.children == null) {
            this.children = new HashSet<>();
        }
        return this.children;
    }
	
	
}
