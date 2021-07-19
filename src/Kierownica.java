public class Kierownica
{   public String kierunek = "prosto";

    public  void skrecanie()
    {
            if (kierunek.equals("prawo"))
        {
            System.out.println("Zmienił się kierunek poruszania pojazdu");
        }
        else if (kierunek.equals("lewo"))
        {
            System.out.println("Zmienił się kierunek poruszania pojazdu");
        }
        else if (kierunek.equals("prosto"))
        {
            System.out.println("Zmienił się kierunek poruszania pojazdu");
        }
        else
        {
            System.out.println("Źle operujesz kierownicą");
        }
    }

}
