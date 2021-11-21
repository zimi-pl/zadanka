package pl.zimi.zadanka.naukaluznezadania.streams.salary;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Examples {
    public static Predicate<Employee> hasMoreThan2() {
        return e -> e.getSalary() > 2500d;
    }

    public static void getChunksOfSets() {
        final int chunkSize = 3;
        final List<Integer> integers =
                Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16);

        AtomicInteger counter = new AtomicInteger();

        Stream<List<Integer>> integerListStream =
                integers
                        .stream()
                        .collect(Collectors.groupingBy(integer -> counter.getAndIncrement() / chunkSize))
                        .entrySet()
                        .stream()
                        .map(Map.Entry::getValue);

        List<List<Integer>> chunkIntegersList =
                integerListStream
                        .collect(Collectors.toList());

        System.out.println(chunkIntegersList);
        // [[2, 4, 6], [8, 10, 12], [14, 16]]
    }

    public static void getFlatMapExample() {
        final List<List<Integer>> slicedIntegers = Arrays.asList(
                Arrays.asList(2, 4, 6),
                Arrays.asList(8, 10, 12),
                Arrays.asList(14, 16)
        );

        final List<Integer> simpleIntegerList =
                slicedIntegers
                        .stream()
                        .flatMap(Collection::stream)
                        .collect(Collectors.toList());

        System.out.println("slicedIntegers: " + slicedIntegers);
        //slicedIntegers: [[2, 4, 6], [8, 10, 12], [14, 16]]

        System.out.println("simpleIntegerList: " + simpleIntegerList);
        //simpleIntegerList: [2, 4, 6, 8, 10, 12, 14, 16]
    }

    public static void main(String[] args) {
        List<Employee> employees =
                Arrays.asList(
                        new Employee(1, 2000d, "Risk Department", Employee.DayJob.FULL_TIME),
                        new Employee(2, 2500d, "Scoring Department", Employee.DayJob.FULL_TIME),
                        new Employee(3, 2600d, "Scoring Department", Employee.DayJob.FULL_TIME),
                        new Employee(4, 2700d, "Credit Department", Employee.DayJob.FULL_TIME),
                        new Employee(5, 2700d, "Credit Department", Employee.DayJob.PART_TIME)
                );
        // list all departments from employees list
        employees.stream()
                .map(e -> e.getDivision())
                .forEach(System.out::println);

        // make supplier
        Supplier<Stream<Employee>> streamSupplier = () -> employees.stream();
        // no idea how to use supplier with nonterminal method
        streamSupplier.get().map(e -> e.getDivision());

        // make predicate #1
        Predicate<Employee> hasMoreThan = e -> e.getSalary() > 2500d;
        employees.stream()
                .filter(hasMoreThan)
                .map(e -> e.getId())
                .forEach(System.out::println);
        // make predicate #2
        employees.stream()
                .filter(hasMoreThan2())
//                .map(e -> e.getId())
                /* these print methods in this case currently do the same*/
                .forEach(System.out::println);
//                .forEach(e->System.out.println(e.toString()));
        /* collectors*/
        List<Employee> filteredEmployeeList = employees
                .stream()
                .filter(hasMoreThan)
                .collect(Collectors.toList());
        /*collectors toMap ; exception in case of key duplication */
        System.out.println("//collectors toMap ; exception in case of key duplication");
        Map<Integer, Employee> employeeMap =
                employees
                        .stream()
                        .limit(3)
                        .collect(Collectors.toMap(
                                Employee::getId,
                                Function.identity(),
                                (key1, key2) -> {
                                    throw new IllegalStateException(String.format("duplicate key value found %s", key1));
                                }
                        ));
        System.out.println(employeeMap);
        /*chunks of sets from list what is atomic integer*/
        /*
         * Jak widzimy wejściowa kolekcja integers została podzielona na mniejsze kolekcje, których rozmiar nie przekraczał
         * wartości wskazywanej przez parametr chunkSize. W moim przypadku tego typu zabieg np. pozwolił na „obejście” limitu
         * Oracle’a związanego z ilością elementów w klauzuli IN (ORA-01795: maximum number of expressions in a list is 1000).
         */
        getChunksOfSets();

        // suma wypłat
        Double salary = employees.stream()
                .collect(Collectors.averagingDouble(e -> e.getSalary()));

        // collectors with joining
        String fullTimeEmployees =
                employees
                        .stream()
                        .filter(employee -> employee.getDayJob().equals(Employee.DayJob.FULL_TIME))
                        .map(employee -> Integer.toString(employee.getId()))
                        .collect(Collectors.joining(" , ", "Employees with id's: ", " work full-time"));

        System.out.println(fullTimeEmployees);
        // Employees with id's: 1 , 2 , 3 , 4 work full-

        /**
         * flatmap example
         */
        getFlatMapExample();



    }
}
