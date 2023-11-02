package videogame.collector.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import videogame.collector.entity.Studio;

@Data
@NoArgsConstructor
public class StudioData {
	

	private Long studioId;
	private String studioName;
	private String studioEmail;
//	private Set<VideogameData> videogames = new HashSet<>();
	
	public StudioData(Studio studio) {
		studioId = studio.getStudioId();
		studioName = studio.getStudioName();
		studioEmail = studio.getStudioEmail();
		
//		for (Videogame videogame : studio.getVideogames()) {
//			videogames.add(new VideogameData(videogame));
//		}
	
		
	}
}
