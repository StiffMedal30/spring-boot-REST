package za.co.dotze.service;

import za.co.dotze.model.User;

import java.util.List;

/**
 * Author - Christiaan Dotze <christiaan@dotze.co.za>
 * Date   - 24 January 2021
 */
public interface UserService {
    void deleteUserById(final Integer userId);

    List<User> findAllUsers();

    void addUser(final User user);

    User getUserByName(final String userName);
}
