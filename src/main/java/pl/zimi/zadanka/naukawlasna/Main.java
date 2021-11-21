package pl.zimi.zadanka.naukawlasna;
import pl.zimi.zadanka.naukawlasna.ClassAB.*;
import pl.zimi.zadanka.naukawlasna.IO.IOSave;
import pl.zimi.zadanka.naukawlasna.tablice.Tablice;

public class Main {
    public static void main(String args[]) {

        Main newMain= new Main();
//        newMain.classAB();
//        IOSave io = new IOSave();
//        io.readline();
        Tablice tabliceObj  = new Tablice();
        tabliceObj.reverseOrder();

    }
     void classAB(){
        ClassA instanceA = new ClassA();
        ClassB instanceB = new ClassB();
    }
    void punkty(){
        Punkt punkt = new Punkt();
        Punkt punktPomocniczy = new Punkt();
        System.out.println("wsp x = " + punkt.getCoordinates().x);
        punkt.setCoordinates(10, 12);
        System.out.println("wsp x = " + punkt.getCoordinatesThis().x);
        punkt.setCoordinates(20, 32);
        punkt.getCoordinates(punkt);
        System.out.println(punkt.x + " " + punkt.y);
        punkt.getCoordinates(punktPomocniczy);
        System.out.println(punktPomocniczy.x + " " + punktPomocniczy.y);
        int x = 0;
    }
}