package part3;


import java.util.function.BiFunction;

public class chap3Section1 {

  public static void main(String[] args) {
    //어떻게 함수형 인터페이슬 활용할까?
    BiFunction<Integer, Integer, Integer> twoAdd = (x, y) -> x + y;
    TriFunction<Integer, Integer, Integer, Integer> threeAdd = (x, y, z) -> x + y + z;
  }
}
