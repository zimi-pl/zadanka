package pl.zimi.zadanka.naukaluznezadania.mojalambda;
//https://github.com/SamouczekProgramisty/KursJava/blob/86c1167200180033586ff4519807548603ddd745/28_wyrazenia_lambda/src/main/java/pl/samouczekprogramisty/kursjava/lambdaexpressions/ArticleExamples.java
//https://www.samouczekprogramisty.pl/wyrazenia-lambda-w-jezyku-java/
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class ArticleExamples {
    // useless
    public ArticleExamples(int x, long y, boolean z) {
    }

    // just main
    public static void main(String[] args) {
        sampleAnonymousClass();
        sampleLambdaExpressions();
        sampleMethodReferenceExpressions();

        sampleUsage();
    }
    // use of lambda as consumer class input for numbers.forEach method
    private static void sampleUsage() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        Consumer<Integer> integerConsumer = n -> System.out.println(n);
        numbers.forEach(integerConsumer);

        numbers.forEach(System.out::println);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
    // override anonymous class with lambda by implementing declared method
    // using Function class we use apply method to compare result of lambda method ??
    private static void sampleAnonymousClass() {
        Checker<Integer> isOddAnonymous = new Checker<Integer>() {
            @Override
            public boolean check(Integer object) {
                return object % 2 != 0;
            }
        };

        Checker<Integer> isOddLambda = object -> object % 2 != 0;

        System.out.println(isOddAnonymous.check(123));
        System.out.println(isOddAnonymous.check(124));

        System.out.println(isOddLambda.check(123));
        System.out.println(isOddLambda.check(124));

        Function<Integer, Boolean> isOddLambda2 = object -> object % 2 != 0;
        System.out.println(isOddLambda2.apply(123));
        System.out.println(isOddLambda2.apply(124));

    }
    // prezentacja interfejsów funkcjonalny powiązanych z wyrażeniami lambda
    private static void sampleLambdaExpressions() {
        UnaryOperator<Integer> square = x -> x * x;
        Supplier<String> someString = () -> "some return value";
        BiConsumer<Integer, Long> multiplier = (Integer x, Long y) -> System.out.println(x * y);
        Function<Integer, Long> multiline = x -> {
            if (x != null && x % 2 == 0) {
                return (long) x * x;
            } else {
                return 123L;
            }
        };
        SideEffectMethod sideEffectMethod = () -> {
        };
    }
    // odpalenie metod poniżej
    private static void sampleMethodReferenceExpressions() {
        constructorReference();
        methodReference();
        instanceMethodReference();
        arrayConstructorReference();
    }

    private static void constructorReference() {
        Supplier<Object> objectCreator = Object::new;
        System.out.println(objectCreator.get());

        // exactly the same as above, without method reference expression
        System.out.println(new Object());
    }

    private static void methodReference() {
        ToIntFunction<Object> equalsMethodOnClass = Object::hashCode;
        Object objectInstance = new Object();
        System.out.println(equalsMethodOnClass.applyAsInt(objectInstance));

        // exactly the same as above, without method reference expression
        System.out.println(objectInstance.hashCode());
    }

    private static void instanceMethodReference() {
        Object objectInstance = new Object();
        IntSupplier equalsMethodOnObject = objectInstance::hashCode;
        System.out.println(equalsMethodOnObject.getAsInt());

        // exactly the same as above, without method reference expression
        System.out.println(objectInstance.hashCode());
    }

    private static void arrayConstructorReference() {
        Function<Integer, int[]> arrayCreator = int[]::new;
        // same as new int[10]
        int[] array = arrayCreator.apply(10);
    }

}