package repositories;

import java.util.List;
import models.Users;

/**
 *
 * @author VU NGUYEN HUONG
 */
public interface IUsersRepository {

    List<Users> getAll();

    List<Users> search(String text);
}
