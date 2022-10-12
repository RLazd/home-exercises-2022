package io.codelex.streams.practice;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CharacterToStringCollector implements Collector<Character, StringBuilder, String> {
    @Override
    public Supplier<StringBuilder> supplier() {
        return () -> new StringBuilder();
    }

    @Override
    public BiConsumer<StringBuilder, Character> accumulator() {
        return (sb, ch) -> sb.append(ch);
    }

    @Override
    public BinaryOperator<StringBuilder> combiner() {
        return (sb, ch) -> sb.append(ch);
    }

    @Override
    public Function<StringBuilder, String> finisher() {
        return (sb) -> sb.toString();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return new HashSet<>();
        //return EnumSet.of(Characteristics.CONCURRENT);
    }
}
