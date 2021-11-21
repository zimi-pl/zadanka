package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.zimi.zadanka.naukawlasna.OuterInnerClass.OuterClass1;
import pl.zimi.zadanka.naukawlasna.OuterInnerClass.OuterClass2;
/*
pojęcia:
top-level klas klasa zewnetrzna nadrzedna
nested static/ nonstatic class - klasa zagnieżdzona statyczna lub nie.
klasa zagnieżdzona statycznie nie ma dostępu do atrybutów niestatycznych klasy zewnetrznej
Przyjazne w przypadku tworzenia bibliotek z objektami i metodami, któe nie powinny wpływać
na klase zewnetrzna a nawet nie wymagającymi tworzenia instancji tej klasy.
 */
public class NwOuterInnerAnonymousClass {
    @Test
    void instantiateInnerClass() {
        /* można odwołąć się do klasy wewnetrznej niestatycznej tylko wtedy gdy utworzona
        * została instacja klasy zewnętrznej, a sam obiekt klasy wewnetrznej został zaincjalizowany
        * w powiązaniu z instancją klasy zewnętrznej.*/
        OuterClass1 outerObject = new OuterClass1();
        OuterClass1.InnerClass instance2 = outerObject.new InnerClass();
        // rozwiązanie powiązane z metodą
        OuterClass1.InnerClass instance1 = outerObject.instantiate();


    }


    @Test
    void instantiateStaticInnerClass() {
        /* można odwołać się do klasy wewnetrznej statycznej bez tworzenia instancji
         * klasy zewnetrznej tworzą obiekt */
        OuterClass2.InnerClass2 instance2 = new OuterClass2.InnerClass2();
        // rozwiązanie powiązane z metodą
        OuterClass2 outerClass = new OuterClass2();
        OuterClass2.InnerClass2 instance1 = outerClass.instantiate();
    }
}
