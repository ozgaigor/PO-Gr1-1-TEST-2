package pl.imiajd.ozga;

public class Autor implements Cloneable, Comparable<Autor> {

    private String nazwa;
    private String adresEmail;
    private char plec;

    public Autor(String nazwa, String adresEmail, char plec) {
        this.nazwa = nazwa;
        this.adresEmail = adresEmail;
        this.plec = plec;
    }

    @Override
    public int compareTo(Autor au) {

        if(this.nazwa.compareTo(au.nazwa)==0){
            if(this.plec==au.plec)
                return 0;

            else if (this.plec>au.plec)
                return 1;

            else
                return -1;
        }
        else if (this.nazwa.compareTo(au.nazwa)==1)
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "nazwa='" + nazwa + '\'' +
                "adresEmail=" + adresEmail +
                "płeć=" + plec+
                '}';
    }


    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public String getAdresEmail() {
        return adresEmail;
    }
    public void setAdresEmail(String adresEmail) {
        this.adresEmail = adresEmail;
    }
    public char getPlec() {
        return plec;
    }
    public void setPlec(char plec) {
        this.plec= plec;
    }

}
