package videogame.collector.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import videogame.collector.controller.model.ConsoleData;
import videogame.collector.controller.model.GenreData;
import videogame.collector.controller.model.StudioData;
import videogame.collector.controller.model.VideogameData;
import videogame.collector.service.VideogameService;

@Slf4j
@RestController
@RequestMapping("/videogame_collector")
public class VideogameCollectorController {
	@Autowired
	private VideogameService videogameService;
	
	@PostMapping("/videogame")
	public VideogameData insertVideogame(@RequestBody VideogameData videogameData) {	
		log.info("Creating videogame {}", videogameData);
		return videogameService.saveVideoGame(videogameData);
	}
	
	@PostMapping("/videogame/{videogameId}/studio")
	public StudioData insertStudio(@RequestBody StudioData studioData, @PathVariable Long videogameId) {
		log.info("Creating Studio {}", studioData);
		return videogameService.saveStudio(studioData);
	}
	@PostMapping("/videogame/{videogameId}/console")														//needs fixed
	public ConsoleData insertConsole(@RequestBody ConsoleData consoleData, @PathVariable Long vidoegameId) {
		log.info("Creating console {}", consoleData);
		return videogameService.saveConsole(consoleData);
	}
	@PostMapping("/videogame/{videogameId}/genre")
	public GenreData insertGenre(@RequestBody GenreData genreData, @PathVariable Long videogameId) {		//needs fixed
		log.info("Creating genre {}", genreData);
		return videogameService.saveGenre(genreData);
	}
}
