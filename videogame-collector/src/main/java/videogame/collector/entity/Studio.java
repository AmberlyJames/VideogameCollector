package videogame.collector.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
public class Studio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studioId;
	
	private String studioName;
	
	@Column(unique = true)
	private String studioEmail;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@OneToMany(mappedBy = "gameStudioId", cascade = CascadeType.ALL)	//use java object to map
	private Set<Videogame> videogames = new HashSet<>();
	
	
}
