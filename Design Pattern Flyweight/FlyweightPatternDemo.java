public class FlyweightPatternDemo {
    
    public static Film[] film = new Film[10];

    public static FilmKonteks[] theaters = new FilmKonteks[10];

    public static FilmSchedule[] jadwals = new FilmSchedule[10];

    private static int ordersCount = 0;

    public static FilmFactory filmFactory;

    public static void takeOrder(String filmIn, int theater, String jadwale)
    {
        film[ordersCount] = filmFactory.getFilm(filmIn);
        theaters[ordersCount] = new FilmKonteks(theater);
        jadwals[ordersCount] = new FilmSchedule(jadwale);
        ordersCount++;
    }

    public static void main(String[] args) {
        
        filmFactory = new FilmFactory();
        takeOrder("Social Network", 2, "12:00");
        takeOrder("Parasite", 3, "15:00");
        takeOrder("The Imitation Game", 1, "18:00");

        for(int i = 0; i < ordersCount; i++)
        {
            film[i].serveFilm(theaters[i], jadwals[i]);
        }

        System.out.println("\nTotal Film yang ditayangkan : "+filmFactory.getTotalFilmShow());
    }
}