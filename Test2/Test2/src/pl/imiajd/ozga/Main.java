package pl.imiajd.ozga;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main{

    public static void main(String[] args)
    {
        ArrayList<Autor> autorzy = new ArrayList<>();
        autorzy.add(new Autor("Igor","Igor@gmail.com",'M'));
        autorzy.add(new Autor("Igor","Igor2@gmail.com",'M'));
        autorzy.add(new Autor("Karolina","Igor3@gmail.com",'K'));
        autorzy.add(new Autor("kamila","Igor4@gmail.com",'K'));

        System.out.println("Bez sortowania ----------------------------------------------------------------------");
        System.out.println(autorzy);

        autorzy.sort(Autor::compareTo);

        System.out.println("Z sortowaniem------------------------------------------------------------------------");
        System.out.println(autorzy);


        ArrayList<Książka> Książki=new ArrayList<>();
        Książki.add(new Książka("Za górami",autorzy.get(0),20));
        Książki.add(new Książka("Za górami",autorzy.get(1),15));
        Książki.add(new Książka("Za pagórkami",autorzy.get(2),17));
        Książki.add(new Książka("Nigdzie",autorzy.get(3),44));

        System.out.println("Bez sortowania ----------------------------------------------------------------------");
        System.out.println(Książki);

        autorzy.sort(Autor::compareTo);

        System.out.println("Z sortowaniem------------------------------------------------------------------------");
        System.out.println(Książki);
        System.out.println("-------------------------------------------------------------------------------------");



        LinkedList<Książka> books= new LinkedList<>();
        books.add(new Książka("Za górami",autorzy.get(0),20));
        books.add(new Książka("Za górami",autorzy.get(0),20));
        books.add(new Książka("Za pagórkami",autorzy.get(2),17));
        books.add(new Książka("Za górami",autorzy.get(0),20));
        usun(books,3);

    }
    public static void usun(LinkedList<Książka> books,int n)
    {
        int a=1;
        for (int i=0;i<books.size();i++)
        {
            if(a==n)
            {
                books.remove(i);
                a=1;
                i--;
            }
            else {
                a++;
            }
        }
        System.out.println(books);
    }

}