package com.devsuperior.nativeQuery.dto;

import com.devsuperior.nativeQuery.projections.ArtistJoinMinProjection;

public class ArtistJoinMinDTO {
	
	private String name;
	private String country;
	
	public ArtistJoinMinDTO() {
	}

	public ArtistJoinMinDTO(String name, String country) {
		this.name = name;
		this.country = country;
	}
	
	public ArtistJoinMinDTO(ArtistJoinMinProjection projection) {
		name = projection.getName();
		country = projection.getCountry();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String contry) {
		this.country = contry;
	}
}
