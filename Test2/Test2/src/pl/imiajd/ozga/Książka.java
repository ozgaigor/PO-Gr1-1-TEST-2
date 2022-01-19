package pl.imiajd.ozga;

public class Książka implements Cloneable,Comparable<Książka>{

    private String tytuł;
    private Autor autor;
    private double cena;

    public Książka(String tytuł, Autor autor, double cena) {
        this.tytuł = tytuł;
        this.autor = autor;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytuł='" + tytuł + '\'' +
                "autor=" + autor +
                "cena=" + cena +
                '}';
    }


    @Override
    public int compareTo(Książka ks) {
        if(this.autor.compareTo(ks.autor)==0)
        {
            if(this.tytuł.compareTo(ks.tytuł)==0)
            {
                if (this.cena==ks.cena)
                    return 0;
                else if(this.cena>ks.cena)
                    return 1;
                else
                    return -1;
            }
            else if(this.tytuł.compareTo(ks.tytuł)==1)
                return 1;
            else
                return -1;
        }
        else if (this.autor.compareTo(ks.autor)==1)
            return 1;
        else
            return -1;
    }

}