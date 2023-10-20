package videogame.collector.controller.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import videogame.collector.entity.Studio;
import videogame.collector.entity.Videogame;

@Data
@NoArgsConstructor
public class StudioData {
	

	private Long studioId;
	private String studioName;
	private String studioEmail;
	private Set<VideogameData> videogames = new HashSet<>();
	
	public StudioData(Studio studio) {
		this.studioId = studio.getStudioId();
		this.studioName = studio.getStudioName();
		this.studioEmail = studio.getStudioEmail();
		
		for (Videogame videogame : studio.getVideogames()) {
			this.videogames.add(new VideogameData(videogame));
		}
	
		
	}
}
