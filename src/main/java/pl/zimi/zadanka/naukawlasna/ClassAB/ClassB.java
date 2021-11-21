package pl.zimi.zadanka.naukawlasna.ClassAB;

public class ClassB {
    void f(){
        System.out.println("Class B");
    }

    public ClassB() {
        f(); // chcialem sprawdzic czy konstruktor wykonuje metode zawarta w ciele klasy
    }
}
