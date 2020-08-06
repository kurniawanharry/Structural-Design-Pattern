import java.util.HashMap;

public class FilmFactory {
    private HashMap <String, Film> films = new HashMap<>();

    public Film getFilm(String filmsName)
    {
        Film film = films.get(filmsName);

        if(film == null)
        {
            film = new Film(filmsName);
            films.put(filmsName, film);
        }
        return film;
    }

    public int getTotalFilmShow()
    {
        return films.size();
    }
}