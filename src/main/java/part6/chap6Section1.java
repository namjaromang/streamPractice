package part6;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class chap6Section1 {

  public static void main(String[] args) {

    Stream<String> nameStream = Stream.of("Alice", "bob", "char");
    List<String> test = nameStream.collect(Collectors.toList());

    String[] cotryArray = new String[]{"san", "toe", "tue"};

    Set<Integer> numberSet = new HashSet<>(Arrays.asList(3, 5, 7));
    numberSet.stream()
        .collect(Collectors.toList());

    Stream<Integer> numberStream = Stream.of(3, -5, 7, 10, -3);
    List<Integer> number = numberStream.filter(x -> x > 0)
        .collect(Collectors.toList());

    List<Integer> numberList = Arrays.asList(3, 6, -4, 6, 2, 3, 3, 3, 3, 3, 3);

    List<Integer> numberMap =
        numberList.stream()
            .map(x -> x * 2)
            .distinct()
            .sorted()
            .collect(Collectors.toList());

    System.out.println(numberMap);

    Map<Integer, Integer> mapStream = new HashMap<>();
    for (int i = 0; i < 10; i++) {
      mapStream.put(i, i);
    }

    System.out.println(number);
  }


  public static <T> void process(List<T> test) {

  }
}
