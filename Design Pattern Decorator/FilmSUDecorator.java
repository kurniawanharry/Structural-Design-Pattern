public class FilmSUDecorator extends FilmDecorator{

    public FilmSUDecorator(Film decoratedFilm) {
        super(decoratedFilm);
        // TODO Auto-generated constructor stub
    }

    public void Judul()
    {
        decoratedFilm.Judul();
        setFilmSU(decoratedFilm);
    }

    private void setFilmSU(Film decoratedFilm)
    {
        System.out.println("Jenis Film : Semua Umur");
    }
  
}