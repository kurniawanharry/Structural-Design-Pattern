public class FilmDetail extends Film{

    private String Judul;
    private double Harga;

    public FilmDetail(CinemasAPI cApi, String Judul, double Harga) {
        super(cApi);
        // TODO Auto-generated constructor stub
        this.Judul = Judul;
        this.Harga = Harga;
    }

    @Override
    public void tampil() {
        // TODO Auto-generated method stub
        cinemasAPI.cinemasCGV(Judul, Harga);
    }
    
}