package pl.zimi.zadanka.naukaluznezadania.dziedziczenie;

public class overloadedClass {
    void overloadedMethod(){
        System.out.println("no arguments");
        overloadedMethod(1);
    }

    void overloadedMethod(int arg){
        System.out.println("number of arguments"+arg);
    }



    public static void main (String arg[]){
        overloadedClass object = new overloadedClass();
        object.overloadedMethod();

    }
}
