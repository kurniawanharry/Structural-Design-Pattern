public abstract class Film {
    protected CinemasAPI cinemasAPI;

    public Film (CinemasAPI cApi)
    {
        cinemasAPI = cApi;
    }

    public abstract void tampil();
}