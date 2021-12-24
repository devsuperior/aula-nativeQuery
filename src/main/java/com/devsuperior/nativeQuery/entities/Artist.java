package com.devsuperior.nativeQuery.entities;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "artists")
public class Artist {
	
	@Id
	private Long id;
	private String name;
	private Instant birthdate;
	private String contry;
	
	@ManyToOne
	@JoinColumn(name = "id_genres")
	private Genre genre;
	
	public Artist() {
	}

	public Artist(Long id, String name, Instant birthdate, String contry, Genre genre) {
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.contry = contry;
		this.genre = genre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instant getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Instant birthdate) {
		this.birthdate = birthdate;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

}
