package videogame.collector.controller.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import videogame.collector.entity.Console;
import videogame.collector.entity.Videogame;

@Data
@NoArgsConstructor
public class ConsoleData {
	
	
	private Long consoleId;
	
	private String consoleName;
	
	private Set<VideogameData> videogames = new HashSet<>();
	
	public ConsoleData(Console console) {
		this.consoleId = console.getConsoleId();
		this.consoleName = console.getConsoleName();
		
		for(Videogame videogame : console.getVideogames()) {
			this.videogames.add(new VideogameData(videogame));
		}
	}

}
