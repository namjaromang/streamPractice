package part3;

@FunctionalInterface
public interface TriFunction<T, U, V, R> {
  //FunctionalInterface 가뭘까?
  R apply(T t, U u, V v);
}
