package pl.zimi.zadanka.naukawlasna.OuterInnerClass;

public class OuterClass1 {
    public class InnerClass {
    }

    public InnerClass instantiate() {
        return new InnerClass();
    }
}