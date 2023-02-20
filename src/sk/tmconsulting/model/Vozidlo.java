package sk.tmconsulting.model;

public class Vozidlo extends SuperVozidlo {
    private double dlzka;
    private double sirka;
    private String farba;

    public void trubi() {
        System.out.println("Tu tuut");
    }

    public void brzdi() {
        System.out.println("........ buum!");
    }

    public double getDlzka() {
        return dlzka;
    }

    public void setDlzka(double dlzka) {
        this.dlzka = dlzka;
    }

    public double getSirka() {
        return sirka;
    }

    public void setSirka(double sirka) {
        this.sirka = sirka;
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }
}
