package com.devsuperior.nativeQuery;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.nativeQuery.dto.ArtistJoinMinDTO;
import com.devsuperior.nativeQuery.dto.ArtistMinDTO;
import com.devsuperior.nativeQuery.projections.ArtistJoinMinProjection;
import com.devsuperior.nativeQuery.projections.ArtistMinProjection;
import com.devsuperior.nativeQuery.repositories.ArtistRepository;

@SpringBootApplication
public class NativeQueryApplication implements CommandLineRunner {
	
	@Autowired
	private ArtistRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(NativeQueryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<ArtistMinProjection> list1 = repository.findByCountry("brazil");
		List<ArtistMinDTO> result1 = list1.stream().map(x -> new ArtistMinDTO(x)).collect(Collectors.toList());
		
		for (ArtistMinDTO obj : result1) {
			System.out.println(obj.getName());
		}
		
		
		List<ArtistJoinMinProjection> list2 = repository.findByGenreJoin("pop");
		List<ArtistJoinMinDTO> result2 = list2.stream().map(x -> new ArtistJoinMinDTO(x)).collect(Collectors.toList());
		
		System.out.println("\n\n *** Exemplo: Join Simples:");
		for (ArtistJoinMinDTO obj : result2) {
			System.out.println(obj.getName() + " - " + obj.getCountry());
		}
		
	}

}
