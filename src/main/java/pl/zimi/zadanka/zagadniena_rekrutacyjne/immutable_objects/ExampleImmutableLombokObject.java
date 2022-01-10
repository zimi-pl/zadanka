package pl.zimi.zadanka.zagadniena_rekrutacyjne.immutable_objects;

import lombok.Value;

@Value
public class ExampleImmutableLombokObject {
    String name;
    int age;
    double score;

    public ExampleImmutableLombokObject(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
