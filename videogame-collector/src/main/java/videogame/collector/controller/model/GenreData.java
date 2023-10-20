package videogame.collector.controller.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import videogame.collector.entity.Genre;
import videogame.collector.entity.Videogame;

@Data
@NoArgsConstructor
public class GenreData {
	
	
	private Long genreId;
	
	private String genreName;
	
	private Set<VideogameData> videogames = new HashSet<>();
	
	public GenreData(Genre genre) {
		this.genreId = genre.getGenreId();
		this.genreName = genre.getGenreName();
		
		for (Videogame videogame : genre.getVideogames()) {
			this.videogames.add(new VideogameData(videogame));
		}
	}
	
	
}
