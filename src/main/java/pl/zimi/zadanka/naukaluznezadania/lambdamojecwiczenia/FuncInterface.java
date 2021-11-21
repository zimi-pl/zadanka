package pl.zimi.zadanka.naukaluznezadania.lambdamojecwiczenia;

public interface FuncInterface {
    void abstractFun(int x);
    default void normalFun() {
        System.out.println("yello");
    }
}
