package pl.zimi.zadanka.naukaluznezadania.casting;

public class Casting {
    public void different() {
        Object objectInstance = new Object();
        Object stringInstance = "string";
        String string = (String) stringInstance;
        System.out.println();
    }
    public void runWithException(){
        Object[] someMysteriousObjects = new Object[] {"1234", new Object()};

        String castedString = (String) someMysteriousObjects[0];
        String classCastException = (String) someMysteriousObjects[1];
    }
    public static void main(String[] args) {
        Casting castingInstance = new Casting();
        castingInstance.different();
//        System.out.println();
        castingInstance.runWithException();
    }
}
