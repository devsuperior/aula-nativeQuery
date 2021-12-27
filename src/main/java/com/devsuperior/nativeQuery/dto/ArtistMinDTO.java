package com.devsuperior.nativeQuery.dto;

import com.devsuperior.nativeQuery.projections.ArtistMinProjection;

public class ArtistMinDTO {
	
	private String name;
	
	public ArtistMinDTO() {
	}

	public ArtistMinDTO(String name) {
		this.name = name;
	}
	
	public ArtistMinDTO(ArtistMinProjection projection) {
		this.name = projection.getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
