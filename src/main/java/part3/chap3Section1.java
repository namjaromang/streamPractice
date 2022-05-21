package part3;


import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class chap3Section1 {

  public static void main(String[] args) {
    //어떻게 함수형 인터페이스를 활용할까?
    BiFunction<Integer, Integer, Integer> twoAdd = (x, y) -> x + y;
    TriFunction<Integer, Integer, Integer, Integer> threeAdd = (x, y, z) -> x + y + z;

    Function<String, Integer> str2int = Integer::parseInt;
    int a = Integer.parseInt("2L");
  }


  public static <T> void process(List<T> test) {

  }
}
