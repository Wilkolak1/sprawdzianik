import java.util.*;
public class Przedmiot {
    private String przedmiot;
    private int liczbaPkt;

    public Przedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public Przedmiot() {
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public double getLiczbaPkt() {
        return liczbaPkt;
    }

    public void setLiczbaPkt(int liczbaPkt) {
        this.liczbaPkt = liczbaPkt;
    }

    @Override
    public int hashCode(){
        return Objects.hash(przedmiot, liczbaPkt);
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Przedmiot przedmiot1 = (Przedmiot) object;

        if (liczbaPkt != przedmiot1.liczbaPkt) return false;
        return java.util.Objects.equals(przedmiot, przedmiot1.przedmiot);
    }

    @Override
    public String toString() {
        return przedmiot + " - " + liczbaPkt;
    }




}
