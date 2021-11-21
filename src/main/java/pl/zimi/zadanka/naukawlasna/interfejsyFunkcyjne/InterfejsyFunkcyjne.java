package pl.zimi.zadanka.naukawlasna.interfejsyFunkcyjne;


public class InterfejsyFunkcyjne {

    @FunctionalInterface
    public interface Callable<V> {
        /**
         * Computes a result, or throws an exception if unable to do so.
         *
         * @return computed result
         * @throws Exception if unable to compute a result
         */
        V call() throws Exception;
    }

    @FunctionalInterface
    public interface TestDefinicji{
        default void testujDefinicje(){}; //zbedne dla definicji interfejsu funkcyjnego musi być ciało
        private void testujPrivate(){} // zbedne dla definicji interfejsu f-ego; musi być ciało.
        public void testuj(); // prawilna metoda interfejsu funkcyjnego

    }

    @FunctionalInterface
    public interface SomeInterface {
        void foo();

        default void bu() {
        }

        static void staticBu() {


        }
    }

    interface A {
        private void foo() {
        }

        void bu();
    }

    public InterfejsyFunkcyjne() {
    }

}
























































































