package za.co.dotze.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.dotze.model.User;
import za.co.dotze.repository.UserRepository;
import za.co.dotze.service.UserService;

import java.util.List;

/**
 * Author - Christiaan Dotze <christiaan@dotze.co.za>
 * Date   - 24 January 2021
 */
@Service
public class SimpleUserService implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void deleteUserById(Integer userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public User getUserByName(String userName) {
        return userRepository.findUsersByFirstName(userName);
    }

    @Override
    public void addUser(final User user) {
        userRepository.save(user);
    }


}
