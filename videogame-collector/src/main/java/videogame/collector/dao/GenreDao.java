package videogame.collector.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import videogame.collector.entity.Genre;

public interface GenreDao extends JpaRepository<Genre, Long> {

	Set<Genre> findAllByGenreNameIn(Set<String> genres);

}
