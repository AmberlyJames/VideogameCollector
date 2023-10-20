package videogame.collector.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import videogame.collector.entity.Genre;

public interface GenreDao extends JpaRepository<Genre, Long> {

}
