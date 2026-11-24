import java.awt.Color;

public class TestPion {
    public static void main(String[] args) {
        Case c = new Case(Color.gray, 2, 3, 0);
        System.out.println(c.getAbscisse());
        System.out.println(c.getOrdonnee());
        System.out.println(c.isOccupe());
        c.setPion(new Pion(CouleurPion.noir));
        System.out.println(c.isOccupe());
        System.out.println(c.getPion());
    }
}