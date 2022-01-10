package pl.zimi.zadanka.zagadniena_rekrutacyjne.watki;

import org.w3c.dom.ls.LSOutput;

public class Watki {
    Thread watek1 = new Thread();

    @Override
    public String toString() {
        return "Watki{" +
                "watek1=" + watek1 +
                '}';
    }
}
