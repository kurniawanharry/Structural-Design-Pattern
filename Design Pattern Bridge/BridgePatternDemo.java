public class BridgePatternDemo {
    public static void main(String[] args) {
        Film theaterOne = new FilmDetail(new TheaterSatu(), "Interstellar", 50000);
        Film theaterTwo = new FilmDetail(new TheaterDua(), "Inception", 50000);

        theaterOne.tampil();
        theaterTwo.tampil();
    }
}