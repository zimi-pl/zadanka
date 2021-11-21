package pl.zimi.zadanka;
import pl.zimi.zadanka.naukawlasna.*;
import org.junit.jupiter.api.Test;
import pl.zimi.zadanka.naukawlasna.Punkt;
import pl.zimi.zadanka.naukawlasna.PunktKolorowy;
import pl.zimi.zadanka.naukawlasna.PunktThis;
import pl.zimi.zadanka.naukawlasna.Tank;

public class testPunkt {
    @Test
    void testowaniePrzeciazania(){

//        Punkt punkt =  new Punkt();
//        Punkt punktPomocniczy = new Punkt(100,200);
//        punkt.getCoordinates(punktPomocniczy);
////        System.out.println(punktPomocniczy.x +" "+punkt.y);
//        System.out.println(punktPomocniczy.getCoordinates().x);
//        PunktKolorowy nowyPunktKolorowy = new PunktKolorowy();
////        System.out.println("nowyPunktKolorowy = " + nowyPunktKolorowy.x + nowyPunktKolorowy.y);

    }
    @Test
    void testowanieOverloading(){
        Tank tank = new Tank();
        System.out.println(tank.getFuelLevel());
    }
    @Test
    void PunktThis(){
        PunktThis Punkt = new PunktThis();
//        Punkt.setCoordinates();
//        System.out.println(Punkt.x+Punkt.y);
    }
}
