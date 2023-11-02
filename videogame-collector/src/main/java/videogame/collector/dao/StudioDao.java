package videogame.collector.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import videogame.collector.entity.Studio;

public interface StudioDao extends JpaRepository<Studio, Long> {

	Optional<Studio> findByStudioEmail(String studioEmail);
	
}
