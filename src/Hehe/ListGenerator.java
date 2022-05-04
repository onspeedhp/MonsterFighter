package Hehe;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ListGenerator {


    public List<Integer> createListFromRange(Integer min, Integer max) {
        return IntStream
                .range(min, max+1)
                .boxed()
                .collect(Collectors.toList());
    }
}
