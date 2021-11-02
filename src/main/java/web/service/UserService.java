package web.service;

import web.model.User;

import javax.validation.Valid;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User readUser(long id);

    User deleteUser(long parseUnsignedInt);

    void createOrUpdateUser(@Valid User user);
    void update(int id, User user);
}
