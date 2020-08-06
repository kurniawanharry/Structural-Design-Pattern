public class ProxyPatternDemo {
    public static void main(String[] args) {
        
       User user = new User("CGV45");

       User userSalah = new User("CGV50");

       ProxyTiket proxyTiket = new ProxyTiket(user);

       ProxyTiket proxyTiketSalah = new ProxyTiket(userSalah);

       System.out.println("Ketika Kode Tiket Benar");
       proxyTiket.tiketOperasi();
       System.out.println("===================================");
       System.out.println("Ketika Kode Tiket Salah");
       proxyTiketSalah.tiketOperasi();
    }
}