public class DecoratorPatternDemo {
    
    public static void main(String[] args) {
        
    Film FilmTayang1 = new FilmDewasaDecorator(new Parasite());

    Film FilmTayang2 = new FilmSUDecorator(new Frozen());
    
    Film FilmTayang3 = new FilmSUDecorator(new Ironman());

        System.out.println("Ruangan Cinemas 1 Menayangkan :");
        FilmTayang1.Judul();

        System.out.println("Ruangan Cinemas 2 Menayangkan :");
        FilmTayang2.Judul();

        System.out.println("Ruangan Cinemas 3 Menayangkan :");
        FilmTayang3.Judul();
    }
}