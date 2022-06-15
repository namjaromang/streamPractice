package part3;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import user.User;

public class chap3Section1 {

  /**
   * 젤 많이 사용하는 처리들
   *
   * @param args
   */
  public static void main(String[] args) {

    //max
    Optional<Integer> max = Stream.of(5, 3, 6, 2, 1)
        .max(Integer::compareTo);
    System.out.println(max);

    LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Seoul"));

    User user1 = new User();
    user1.setId(1L);
    user1.setName("일");
    user1.setVerified(true);
    user1.setEmail("1@me.com");

    user1.setAmount(BigDecimal.valueOf(1001.1));
    user1.setStatus("ERROR");
    user1.setEmail("1@me.com");
    user1.setCreateAt(now.plusHours(1));
    user1.setUpdateAt(now.plusHours(2));

    User user2 = new User();
    user2.setId(2L);
    user2.setName("이");
    user2.setVerified(true);
    user2.setEmail("2@me.com");
    user2.setAmount(BigDecimal.valueOf(4004.2));
    user2.setStatus("SUCCESS");
    user2.setCreateAt(now.plusHours(3));
    user2.setUpdateAt(now.plusHours(4));

    User user3 = new User();
    user3.setId(3L);
    user3.setName("삼");
    user3.setVerified(true);
    user3.setEmail("3@me.com");
    user3.setAmount(BigDecimal.valueOf(2002.2));
    user3.setStatus("ERROR");
    user3.setCreateAt(now.plusHours(5));
    user3.setUpdateAt(now.plusHours(6));

    List<User> users = Arrays.asList(user1, user2, user3);

    User firstUser = users.stream()
        .min(Comparator.comparing(User::getName))
        .get();
    System.out.println(firstUser);

    Long positiveIntegerCount = Stream.of(1, -4, 5, -3, 6)
        .filter(x -> x > 0)
        .count();

    System.out.println(positiveIntegerCount);

    Long activeUserCount =
        users.stream()
            .filter(user -> user.getCreateAt()
                .isAfter(now.minusDays(1)))
            .filter(user -> !user.getVerified())
            .count();

    System.out.println(activeUserCount);

    List userList =
        users.stream()
            .filter(user -> user.status.equals("ERROR"))
            .max((u1, u2) -> u1.amount.compareTo(u2.amount))
            .stream()
            .collect(Collectors.toList());
    System.out.println(userList);

    List<Integer> numbers = Arrays.asList(3, -4, 27, 9);
    Boolean allpositive = numbers.stream()
        .allMatch(number -> number > 0);
    System.out.println(allpositive);

    Boolean allUserCheck = users.stream()
        .allMatch(User::getVerified);

    System.out.println(allUserCheck);

    Boolean anyUserCheck = users.stream()
        .anyMatch(user -> user.getStatus()
            .equals("ERROR"));

    System.out.println(anyUserCheck);

  }
}
