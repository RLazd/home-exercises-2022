package io.codelex.streams.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamsExercise {
    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> (int) Math.sqrt(number))
                .toList();
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        return user.stream()
                    .map(User::getAge)
                    .toList();
    }

    public static List<Integer> getDistinctAges(List<User> users) {
       return users.stream()
                    .map(User::getAge)
                    .distinct()
                    .toList();

    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream().limit(limit).toList();
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        return users.stream().filter(user -> user.getAge() > 25).toList().size();
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).toList();
    }

    public static Integer sum(List<Integer> integers) {
        return integers.stream().mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream().skip(toSkip).toList();
    }

    public static List<String> getFirstNames(List<String> names) {
        return names.stream()
                    .map(name->name.split(" ")[0])
                    .toList();
    }

    //.flatMap() = [[a, b], [c, d], [e, f]] => flatMap => [a, b, c, d ,e]
    public static List<String> getDistinctLetters(List<String> names) {
        return names.stream()
                    .flatMap(name->Arrays.stream(name.split("")))
                    .distinct()
                    .toList();
    }


    public static String separateNamesByComma(List<User> users) {
        return users.stream().map(User::getName).collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users) {
        return users.stream().map(User::getAge).mapToInt(Integer::intValue).summaryStatistics().getAverage();
    }

    public static Integer getMaxAge(List<User> users) {
        return users.stream().map(User::getAge).mapToInt(Integer::intValue).max().getAsInt();
    }

    public static Integer getMinAge(List<User> users) {
        //return users.stream().map(User:: getAge).mapToInt(Integer::intValue).summaryStatistics().getMin();
        return users.stream().map(User::getAge).mapToInt(Integer::intValue).min().getAsInt();
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        return users.stream().collect(partitioningBy(user -> user.isMale()));

    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream().collect(groupingBy(User::getAge));

    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream().collect(partitioningBy(User::isMale, groupingBy(User::getAge)));
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        return users.stream().collect(partitioningBy(User::isMale, counting()));
    }

    public static boolean anyMatch(List<User> users, int age) {
        return users.stream().anyMatch(user -> user.getAge() == age);
    }

    public static boolean noneMatch(List<User> users, int age) {
        return users.stream().noneMatch(user -> user.getAge() == age);
    }

    public static Optional<User> findAny(List<User> users, String name) {
        return users.stream().filter(user -> user.getName().equals(name)).findAny();
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream().sorted(Comparator.comparing(User::getAge)).toList();
        //return users.stream().sorted((user1, user2)->user1.getAge().compareTo(user2.getAge())).toList();/
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream.boxed();
    }

    //IntStream.range(start, end excl)
    public static List<Integer> generateFirst10PrimeNumbers() {
        return IntStream.range(2,100)
                        .filter(StreamsExercise::isPrime)
                        .limit(10)
                        .boxed()
                        .toList();
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        return new Random().ints(10)
                            .boxed()
                            .toList();
    }

    public static User findOldest(List<User> users) {
        return users.stream().sorted(Comparator.comparing(User::getAge).reversed()).toList().get(0);
    }

    public static int sumAge(List<User> users) {
        return users.stream().map(User::getAge).mapToInt(Integer::intValue).sum();
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        return users.stream().map(User::getAge).mapToInt(Integer::intValue).summaryStatistics();
    }
}
