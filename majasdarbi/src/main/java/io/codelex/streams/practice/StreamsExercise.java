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
        List<Integer> ages = new ArrayList<>();
        user.stream().forEach(us -> ages.add(us.getAge()));
        return ages;
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        Set<Integer> ages = new HashSet<>();
        users.stream().forEach(user -> ages.add(user.getAge()));
        return ages.stream().toList();
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
        List<String> firstNames = new ArrayList<>();
        names.stream().forEach(name -> firstNames.add(name.split(" ")[0]));
        return firstNames;
    }

    public static List<String> getDistinctLetters(List<String> names) {
        List<String> letters = new ArrayList<>();

        names.stream().forEach(name -> {
            Arrays.stream(name.split("")).forEach(let -> letters.add(let));
        });

        return letters.stream().distinct().toList();
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

    public static List<Integer> generateFirst10PrimeNumbers() {
        List<Integer> primes = new ArrayList<>();
        int i = 2;
        while (primes.size() != 10) {
            if (isPrime(i)) {
                primes.add(i);
            }
            i++;
        }
        return primes;
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        List<Integer> randomNumbers = new ArrayList<>();
        new Random().ints(10).forEach(num -> randomNumbers.add(num));
        return randomNumbers;
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
