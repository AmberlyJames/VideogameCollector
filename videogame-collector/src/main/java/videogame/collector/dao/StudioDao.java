package videogame.collector.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import videogame.collector.entity.Studio;

public interface StudioDao extends JpaRepository<Studio, Long> {

}
