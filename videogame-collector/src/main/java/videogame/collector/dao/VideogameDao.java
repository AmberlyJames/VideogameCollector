package videogame.collector.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import videogame.collector.entity.Videogame;

public interface VideogameDao extends JpaRepository<Videogame, Long> {

}
