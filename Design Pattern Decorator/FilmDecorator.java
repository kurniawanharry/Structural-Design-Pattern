public abstract class FilmDecorator implements Film{
    protected Film decoratedFilm;

    public FilmDecorator(Film decoratedFilm)
    {
        this.decoratedFilm = decoratedFilm;
    }

    public void Judul()
    {
        decoratedFilm.Judul();
    }

}