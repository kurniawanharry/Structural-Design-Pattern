public class Film implements CFilm{

    private final String judulFilm;

    public Film (String newFilm)
    {
        this.judulFilm = newFilm;
        System.out.println("Film yang ditayangkan : "+judulFilm);
    }

    public String getJudulFilm()
    {
        return this.judulFilm;
    }

    @Override
    public void serveFilm(FilmKonteks konteks, FilmSchedule jadwal) {
        // TODO Auto-generated method stub
        System.out.println("Film "+judulFilm+" untuk theater "+konteks.getTheater()+" Dimulai pada jam : "+jadwal.getJadwal());
    }
}