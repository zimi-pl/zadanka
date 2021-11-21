package pl.zimi.zadanka.naukawlasna;

public class Punkt {
    public int x, y;

//    public Punkt() {
//        setCoordinates(300, 200);
//    }
//
//    public Punkt(int x, int y) {
//        setCoordinates(x, y);
//    }
    // ustawianie pol x i y klasy point
    void setCoordinates(int givenX, int givenY) {
        x = givenX;
        y = givenY;
    }

    // nie wiem co autor mial na mysli
    public void getCoordinates(Punkt point) {
        point.x = x;
        point.y = y;
    }
    public Punkt getCoordinatesThis(){

        return this;
    }

    public Punkt getCoordinates() {
        Punkt point = new Punkt();
        point.x = x;
        point.y = y;
        return point;
    }
}
