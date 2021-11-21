package pl.zimi.zadanka.naukaluznezadania.equalshashcode;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object a) {
        if (a == this) {
            return true;
        }
        if (a instanceof Cat) {
            Cat objectCat = (Cat) a;
            if (objectCat.name.equals(this.name) && objectCat.age == this.age) {
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

