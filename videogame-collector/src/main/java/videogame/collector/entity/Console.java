package videogame.collector.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
public class Console {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long consoleId;
	
	
	private String consoleName;
	
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(mappedBy = "consoles")
	private Set<Videogame> videogames = new HashSet<>();
}
