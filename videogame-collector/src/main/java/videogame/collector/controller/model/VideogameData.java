package videogame.collector.controller.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import videogame.collector.entity.Console;
import videogame.collector.entity.Genre;
import videogame.collector.entity.Studio;
import videogame.collector.entity.Videogame;

@Data
@NoArgsConstructor
public class VideogameData {
	


	private Long videogameId;

	private String videogameName;

	private Studio studioId;
	
	private Set<ConsoleData> consoles = new HashSet<>();

	private Set<GenreData> genres = new HashSet<>();
	
	
	public VideogameData(Videogame videogame) {
		this.videogameId = videogame.getVideogameId();
		this.videogameName = videogame.getVideogameName();
		this.studioId = videogame.getStudioId();
		
		for (Console console : videogame.getConsoles()) {
			this.consoles.add(new ConsoleData(console));
		}
		for (Genre genre : videogame.getGenres()) {
			this.genres.add(new GenreData(genre));
		}
	}
}
