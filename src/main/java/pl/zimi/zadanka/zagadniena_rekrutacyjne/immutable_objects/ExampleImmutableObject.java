package pl.zimi.zadanka.zagadniena_rekrutacyjne.immutable_objects;

public final class ExampleImmutableObject {
    private final String name;
    private final int level;
    private final int completion;

    public ExampleImmutableObject(String name, int level, int completion) {
        this.name = name;
        this.level = level;
        this.completion = completion;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getCompletion() {
        return completion;
    }
}
