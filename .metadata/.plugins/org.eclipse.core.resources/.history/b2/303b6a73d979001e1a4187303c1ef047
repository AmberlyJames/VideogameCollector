package videogame.collector.controller.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import videogame.collector.entity.Console;
import videogame.collector.entity.Genre;
//import videogame.collector.entity.Studio;
import videogame.collector.entity.Videogame;

@Data
@NoArgsConstructor
public class VideogameData {
	
	private Long videogameId;

	private String videogameName;

	private StudioData studioIdentity;					
	
	private Set<String> consoles = new HashSet<>();

	private Set<String> genres = new HashSet<>();
	
	
	public VideogameData(Videogame videogame) {
		videogameId = videogame.getVideogameId();
		videogameName = videogame.getVideogameName();
		studioIdentity = new StudioData(videogame.getGameStudioId());				
		
		for (Console console : videogame.getConsoles()) {
			consoles.add(console.getConsoleName());
		}
		for (Genre genre : videogame.getGenres()) {
			genres.add(genre.getGenreName());
		}
	}
}
