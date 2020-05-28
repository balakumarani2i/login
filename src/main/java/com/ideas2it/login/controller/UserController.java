package com.ideas2it.login.controller;

import com.ideas2it.login.common.Constants;
import com.ideas2it.login.model.User;
import com.ideas2it.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Constants.MAPPER_USER)
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @RequestMapping(name = Constants.MAPPER_ID, method = RequestMethod.GET)
    public User getUserById(@PathVariable (Constants.ID) Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping(name = Constants.MAPPER_ID, method = RequestMethod.DELETE)
    public User deactivateUser(@PathVariable (Constants.ID) Long id) {
        return userService.deactivateUser(id);
    }
}
