package com.devsuperior.nativeQuery.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.nativeQuery.entities.Artist;
import com.devsuperior.nativeQuery.projections.ArtistJoinMinProjection;
import com.devsuperior.nativeQuery.projections.ArtistMinProjection;

public interface ArtistRepository extends JpaRepository<Artist, Long> {

	@Query(nativeQuery = true, value = "SELECT name " + 
			"FROM artists " + 
			"WHERE UPPER(contry) LIKE UPPER(:contry)")
	List<ArtistMinProjection> findByCountry(String contry);
	
	@Query(nativeQuery = true, value = "SELECT artists.name, artists.contry " + 
			"FROM artists " + 
			"INNER JOIN genres ON artists.genre_id = genres.id " + 
			"WHERE UPPER(genres.name) = UPPER(:genreName)")
	List<ArtistJoinMinProjection> findByGenreJoin(String genreName);
}
