package videogame.collector.service;

import java.util.NoSuchElementException;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import videogame.collector.controller.model.ConsoleData;
import videogame.collector.controller.model.GenreData;
import videogame.collector.controller.model.StudioData;
import videogame.collector.controller.model.VideogameData;
import videogame.collector.dao.ConsoleDao;
import videogame.collector.dao.StudioDao;
import videogame.collector.dao.VideogameDao;
import videogame.collector.dao.GenreDao;
import videogame.collector.entity.Console;
import videogame.collector.entity.Genre;
import videogame.collector.entity.Studio;
import videogame.collector.entity.Videogame;

@Service
public class VideogameService {
	@Autowired
	private VideogameDao videogameDao;

	@Autowired
	private StudioDao studioDao;

	@Autowired
	private ConsoleDao consoleDao;

	@Autowired
	private GenreDao genreDao;

	@Transactional(readOnly = false)
	public StudioData saveStudio(StudioData studioData) {
		Long studioId = studioData.getStudioId();
		Studio studio = findOrCreateStudio(studioId);
		setFieldsInStudio(studio, studioData);
	
		return new StudioData(studioDao.save(studio));
	}

	private void setFieldsInStudio(Studio studio, StudioData studioData) {
		studio.setStudioName(studioData.getStudioName());
		studio.setStudioEmail(studioData.getStudioEmail());
	}

	private Studio findOrCreateStudio(Long studioId) {
		Studio studio;
		if (Objects.isNull(studioId)) {
			studio = new Studio();
		} else {
			studio = findStudioById(studioId);
		}
		return studio;
	}

	private Studio findStudioById(Long studioId) {
		return studioDao.findById(studioId)
				.orElseThrow(() -> new NoSuchElementException("Studio with ID=" + studioId + " was not found."));
		
	}

	@Transactional(readOnly = false)
	public ConsoleData saveConsole(ConsoleData consoleData) {
		Long consoleId = consoleData.getConsoleId();
		Console console = findOrCreateConsole(consoleId);

		setFieldsinConsole(console, consoleData);
		return new ConsoleData(consoleDao.save(console));
	}

	private void setFieldsinConsole(Console console, ConsoleData consoleData) {
		console.setConsoleName(consoleData.getConsoleName());
	}

	private Console findOrCreateConsole(Long consoleId) {
		Console console;

		if (Objects.isNull(consoleId)) {
			console = new Console();
		} else {
			console = findConsoleById(consoleId);
		}
		return console;
	}

	private Console findConsoleById(Long consoleId) {
		return consoleDao.findById(consoleId)
				.orElseThrow(() -> new NoSuchElementException("Console with ID=" + consoleId + " was no found."));
	}
	@Transactional(readOnly = false)
	public GenreData saveGenre(GenreData genreData) {
		Long genreId = genreData.getGenreId();
		Genre genre = findOrCreateGenre(genreId);
		setFieldsInGenre(genre, genreData);
		return new GenreData(genreDao.save(genre));
	}

	private void setFieldsInGenre(Genre genre, GenreData genreData) {
		genre.setGenreName(genreData.getGenreName());
	}

	private Genre findOrCreateGenre(Long genreId) {
		Genre genre;
		if (Objects.isNull(genreId)) {
			genre = new Genre();
		} else {
			genre = findGenreById(genreId);
		}
		return genre;
	}

	private Genre findGenreById(Long genreId) {
		return genreDao.findById(genreId)
				.orElseThrow(() -> new NoSuchElementException("Genre with ID=" + genreId + "was not found."));
	}
	@Transactional(readOnly = false)
	public VideogameData saveVideoGame(VideogameData videogameData) {
		Long videogameId = videogameData.getVideogameId();
		Videogame videogame = findOrCreateVideogame(videogameId);
		setFieldsInVideogame(videogame, videogameData);
		return new VideogameData(videogameDao.save(videogame));
	}

	private void setFieldsInVideogame(Videogame videogame, VideogameData videogameData) {
		videogame.setVideogameName(videogameData.getVideogameName());
		videogame.setStudioId(videogameData.getStudioId());;
		
	}

	private Videogame findOrCreateVideogame(Long videogameId) {
		Videogame videogame;
		if (Objects.isNull(videogameId)) {
			videogame = new Videogame();
		} else {
			videogame = findVideogameById(videogameId);
		}
		return videogame;
	}

	private Videogame findVideogameById(Long videogameId) {
		return videogameDao.findById(videogameId)
				.orElseThrow(() -> new NoSuchElementException("Videogame with ID=" + videogameId + "was not found."));
	}

}
