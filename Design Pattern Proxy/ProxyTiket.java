public class ProxyTiket implements Tiket{

    RealTiket realTiket;
    User user;

    public ProxyTiket(User user)
    {
        this.user = user;
    }

    @Override
    public void tiketOperasi() 
    {
        if(user.getKodeTiket().equalsIgnoreCase("CGV45"))
        {
            realTiket = new RealTiket();
            realTiket.tiketOperasi();
        }
        else
        {
            System.out.println("Kode Tiket Tidak terdeteksi");
        }
        // TODO Auto-generated method stub
    }  
}