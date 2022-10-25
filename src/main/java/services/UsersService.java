package services;

import java.util.List;
import models.Users;
import repositories.IUsersRepository;
import repositories.UsersRepository;

/**
 *
 * @author VU NGUYEN HUONG
 */
public class UsersService implements IUsersService {

    private IUsersRepository repo;

    public UsersService() {
        repo = new UsersRepository();
    }

    @Override
    public List<Users> getAll() {
        return repo.getAll();
    }

    @Override
    public List<Users> search(String text) {
        return repo.search(text);
    }

}
