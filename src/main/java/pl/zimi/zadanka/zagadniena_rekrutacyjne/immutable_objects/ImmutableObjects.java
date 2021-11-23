package pl.zimi.zadanka.zagadniena_rekrutacyjne.immutable_objects;

public class ImmutableObjects {
    public static void main(String[] args) {
        String string1 = "label";
        //String jest niemodyfikowalny
        // nie posiada getterów ani setterów
        // modyfikacja stringa odbywa się za pomocą tworzenia
        // nowego obiektu
        /*
         * Przykład pokazując, że wartości string są składowane na stosie (heap). Zmienne wskazują poprzez referencję do tych wartości
         * edna wartość string może linkowana do wielu zmiennych. Warotść string na stosie jest niemutowalna
         *
         * */
        string1 += " 1 ";
        System.out.println("string1 = " + string1);
        string1 = "Java";
        System.out.println("string1 = " + string1);
        System.out.println("----------------------------------");
        System.out.println("String string1 = \"Java\" " + System.identityHashCode(string1));
        System.out.println("new string = \"Java\" " + System.identityHashCode("Java"));
        System.out.println("new string = \"Java\" " + System.identityHashCode("Java"));
        String string2 = "Java";
        System.out.println("String string2  = \"Java\" " + System.identityHashCode(string2));
        System.out.println("----------------------------------");
        string1 = "Python";
        System.out.println("String string1 = \"Python\" " + System.identityHashCode(string1));
        System.out.println("----------------------------------");


    }

}
