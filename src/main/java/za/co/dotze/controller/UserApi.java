package za.co.dotze.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.dotze.model.User;
import za.co.dotze.service.UserService;

import java.util.List;

/**
 * Author - Christiaan Dotze <christiaan@dotze.co.za>
 * Date   - 24 January 2021
 */
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("api/")
public class UserApi {

    @Autowired
    private UserService userService;

    @GetMapping("users")
    public List<User> getUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("{userName:[\\d]+}/getUser")
    public User findUserByName(final @PathVariable String userName) {
        return userService.getUserByName(userName);
    }

    @GetMapping("addUser")
    public void addUser(final User user) {
        userService.addUser(user);

    }

    @GetMapping("{userId:[\\d]+}/deleteUser")
    public void deleteUserById(@PathVariable final Integer userId) {
        userService.deleteUserById(userId);
    }
}
