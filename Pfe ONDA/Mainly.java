
import java.time.LocalTime;

public class Mainly{
    public static void main(String[] args) {
        LocalTime local = LocalTime.of(10, 0, 0);
        Aeroport a = new Aeroport(1,  "CMN");
        Aeroport b = new Aeroport(2,  "RBT");
        Vol vol = new Vol(122, 123,a,b);
        Comptoir c1 = new Comptoir(1, "C1");
        Comptoir c2 = new Comptoir(2, "C2");
        Porte p = new Porte(1, "P1");
        Mouvement m = new Mouvement(vol, 60, local, "em", p);
        m.addC(c1);
        System.out.println(m);
        m.addC(c2);
        System.out.println(m);

    }
    
}
