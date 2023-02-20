import sk.tmconsulting.model.Audi;

public class VozidloMain {
    public static void main(String[] args) {
        Audi audiObjekt1 = new Audi();
        audiObjekt1.setDlzka(4.8);
        audiObjekt1.setSirka(1.2);
        audiObjekt1.setFarba("strieborná");

        audiObjekt1.trubi();
        audiObjekt1.brzdi();

        audiObjekt1.isLieta();


    }
}
