package pl.zimi.zadanka.naukaluznezadania.equalshashcode;


public class EqualsHashCode {
    public static void jakiesTam() {
        Integer costam = new Integer(5);
        System.out.println(costam.hashCode());

        Object objkt = new Object();
    }

    /*
        passing reference cat1 to cat2, but not values of fields
     */
    public static void objectIdentity() {
        Cat cat1 = new Cat("Janek", 18);
        Cat cat2 = cat1;
        System.out.println(cat1 == cat2);
        System.out.println("cat1=" + cat1.toString() +"" +
                "\n"+ "cat2=" + cat2.toString());

    }

    public static void objectEquality() {

    }

    public static void main(String[] args) {
        objectIdentity();

    }


}
