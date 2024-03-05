import java.util.*;
public class Student {
    private String imie;
    private String nazwisko;
    private int nrIndeksu;
    private int rokStudiu;
    private List<Przedmiot> listaPrzed;

    public Student(String imie, String nazwisko, int nrIndeksu, int rokStudiu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndeksu = nrIndeksu;
        this.rokStudiu = rokStudiu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public int getRokStudiu() {
        return rokStudiu;
    }

    public java.util.List<Przedmiot> getListaPrzed() {
        return listaPrzed;
    }

    @Override
    public String toString() {
        return "Imie: " + imie + "," + "Nazwisko: " + nazwisko + "," + "NrIndeksu: " + nrIndeksu + "," + "RokStudiow: " + rokStudiu;
    }
    @Override
    public int hashCode(){
        return Objects.hash(imie, nazwisko, nrIndeksu, rokStudiu, listaPrzed);
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Student student = (Student) object;

        if (nrIndeksu != student.nrIndeksu) return false;
        if (rokStudiu != student.rokStudiu) return false;
        if (!java.util.Objects.equals(imie, student.imie)) return false;
        if (!java.util.Objects.equals(nazwisko, student.nazwisko)) return false;
        return java.util.Objects.equals(listaPrzed, student.listaPrzed);
    }

    public void dodajPrzedmiot(Przedmiot przedmiot){
    listaPrzed.add(przedmiot);
    }





}
