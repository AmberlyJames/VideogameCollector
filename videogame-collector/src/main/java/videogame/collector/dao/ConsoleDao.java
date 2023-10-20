package videogame.collector.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import videogame.collector.entity.Console;

public interface ConsoleDao extends JpaRepository<Console, Long> {

}
