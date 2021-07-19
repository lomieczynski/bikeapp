import java.util.Scanner;

public class Rower {

    static String wyb;
    static void setoperacja (String r)
    { wyb = r; }

    public static void main (String args[])
    {   int  h = 0;

        Scanner scanner = new Scanner(System.in);
        Kolo1 przedniekolo = new Kolo1();
        Kolo2 tylniekolo = new Kolo2();

        while (h==0)
        {
            System.out.println("");
            System.out.println("STATUS:");
            if (przedniekolo.kiera.kierunek.equals("prawo"))
        {System.out.println("Kierunek jazdy: prawo"); }
            else if (przedniekolo.kiera.kierunek.equals("lewo"))
        {System.out.println("Kierunek jazdy: lewo");}
            else if (przedniekolo.kiera.kierunek.equals("prosto"))
        {System.out.println("Kierunek jazdy: prosto"); }
            if (tylniekolo.lancuch.pedlas.startstop==0)
        {System.out.println("Rower nie jedzie");}
            else if (tylniekolo.lancuch.pedlas.startstop==1)
        {System.out.println("Rower jedzie wolno"); }
            else if (tylniekolo.lancuch.pedlas.startstop==2)
        {System.out.println("Rower jedzie ze średnią prędkością");}
            else if (tylniekolo.lancuch.pedlas.startstop==3)
        {System.out.println("Rower jedzie szybko"); }
            System.out.println(""+ "\n" + "Wybierz opcję:" + "\n" +"wciśnij r aby decydować, czy rower się porusza" +  "\n" +  "wciśnij k aby zmieniać kierunek jazdy ");
            setoperacja(scanner.next());


            if ( wyb.equals("k") )
            {
                System.out.println("aby skręcić w prawo wpisz w konsole słowo: prawo" + "\n" + "aby skręcić w lewo wpisz w konsole słowo: lewo" + "\n" + "aby jechać prosto wpisz w konsole słowo: prosto");
                przedniekolo.setkierunek(scanner.next());
                przedniekolo.getkierunek();

            }
            else if (wyb.equals("r") )
            {
                System.out.println("1 - wolna jazda"+"\n"+"2 - jazda ze średnią prędkością"+"\n"+"3 - szybka jazda"+"\n"+"0 - HAMULEC");
                tylniekolo.setjazda(scanner.nextInt());
                tylniekolo.getjazda();

            } else
            {
                System.out.println("Błędnie wybrałeś operację");
            }

        }

    }
}
