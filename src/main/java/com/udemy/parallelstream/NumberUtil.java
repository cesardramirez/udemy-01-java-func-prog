package com.udemy.parallelstream;

import java.util.List;
import java.util.stream.Collectors;

public class NumberUtil {

    private List<Integer> numbers;

    public NumberUtil(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Integer sumStream() {
        return numbers.stream()
                .reduce(0, Integer::sum);
    }

    public Integer sumParallelStream() {
        return numbers.parallelStream()
                .reduce(0, Integer::sum);
    }

    public Integer sumStreamPrint() {
        return numbers.stream()
                .peek(num -> System.out.print(num + "\t"))
                .reduce(0, Integer::sum);
    }

    public Integer sumParallelStreamPrint() {
        return numbers.parallelStream()
                .peek(num -> System.out.print(num + "\t"))
                .reduce(0, Integer::sum);
    }

    public String stringStreamResult() {
        return numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("\t"));
    }

    public String stringParallelStreamResult() {
        return numbers.parallelStream()
                .map(String::valueOf)
                .collect(Collectors.joining("\t"));
    }
}
