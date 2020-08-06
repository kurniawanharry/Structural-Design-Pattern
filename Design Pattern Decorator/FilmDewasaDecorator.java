public class FilmDewasaDecorator extends FilmDecorator{

    public FilmDewasaDecorator(Film decoratedFilm) {
        super(decoratedFilm);
        // TODO Auto-generated constructor stub
    }

    public void Judul()
    {
        decoratedFilm.Judul();
        setFilmDewasa(decoratedFilm);
    }

    private void setFilmDewasa(Film decoratedFilm)
    {
        System.out.println("Jenis Film : Dewasa");
    }
    
}