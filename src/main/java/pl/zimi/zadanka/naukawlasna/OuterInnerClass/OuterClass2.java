package pl.zimi.zadanka.naukawlasna.OuterInnerClass;

public class OuterClass2 {
    public static class InnerClass2 {
    }

    public InnerClass2 instantiate() {
        return new InnerClass2();
    }
}