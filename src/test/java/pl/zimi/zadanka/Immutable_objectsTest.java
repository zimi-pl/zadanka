package pl.zimi.zadanka;

import org.junit.jupiter.api.Test;
import pl.zimi.zadanka.zagadniena_rekrutacyjne.immutable_objects.ExampleImmutableLombokObject;
import pl.zimi.zadanka.zagadniena_rekrutacyjne.immutable_objects.ExampleImmutableObject;

import static org.mutabilitydetector.unittesting.MutabilityAssert.assertImmutable;

public class Immutable_objectsTest {
    @Test
    void testOne() {
        assertImmutable(ExampleImmutableObject.class);
    }

    @Test
    void testWithLombokCreatedClass() {
        ExampleImmutableLombokObject exampleImmutableLombokObject1 =
                new ExampleImmutableLombokObject("Henio", 23, (double) 100);
//        exampleImmutableLombokObject1.getScore();
        assertImmutable(ExampleImmutableLombokObject.class);

    }
}
