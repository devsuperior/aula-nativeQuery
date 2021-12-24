package com.devsuperior.nativeQuery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.nativeQuery.entities.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Long> {

}
