package videogame.collector.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import videogame.collector.entity.Console;

@Data
@NoArgsConstructor
public class ConsoleData {
	
	
	private Long consoleId;
	
	private String consoleName;
	
//	private Set<VideogameData> videogames = new HashSet<>();
	
	public ConsoleData(Console console) {
		this.consoleId = console.getConsoleId();
		this.consoleName = console.getConsoleName();
		
//		for(Videogame videogame : console.getVideogames()) {
//			this.videogames.add(new VideogameData(videogame));
//		}
	}

}
