package com.devsuperior.nativeQuery.dto;

import com.devsuperior.nativeQuery.projections.ArtistJoinMinProjection;

public class ArtistJoinMinDTO {
	
	private String name;
	private String contry;
	
	public ArtistJoinMinDTO() {
	}

	public ArtistJoinMinDTO(String name, String contry) {
		this.name = name;
		this.contry = contry;
	}
	
	public ArtistJoinMinDTO(ArtistJoinMinProjection projection) {
		name = projection.getName();
		contry = projection.getContry();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}
}
