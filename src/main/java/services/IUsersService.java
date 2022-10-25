package services;

import java.util.List;
import models.Users;

/**
 *
 * @author VU NGUYEN HUONG
 */
public interface IUsersService {
    List<Users> getAll();

    List<Users> search(String text);
}
