package com.devsuperior.nativeQuery.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "genres")
public class Genre {
	
	@Id
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "genre")
	private List<Artist> artists = new ArrayList<>();
	
	public Genre() {
	}

	public Genre(Long id, String name, List<Artist> artists) {
		this.id = id;
		this.name = name;
		this.artists = artists;
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

	public List<Artist> getArtists() {
		return artists;
	}
}
