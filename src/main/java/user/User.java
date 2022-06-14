package user;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

  public Long id;
  public String name;
  public Boolean verified;
  public String email;
  public BigDecimal amount;
  public String status;

  public LocalDateTime createAt;
  public LocalDateTime updateAt;

}
