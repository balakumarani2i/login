package com.ideas2it.login.dao;

import com.ideas2it.login.model.User;

import java.util.List;

public interface UserDao {

    /**
     * <p>
     *     Save user with details
     * </p>
     * @param user - user object with details
     * @return user - saved object
     */
    User saveUser(User user);

    /**
     * <p>
     *     Update user details
     * </p>
     * @param user - updated user details
     * @return user - updated user object
     */
    User updateUser(User user);

    /**
     * <p>
     *     Retrive user by id
     * </p>
     * @param id - id of user
     * @return user - corresponding object
     */
    User getUserById(Long id);

    /**
     * <p>
     *      Get all users
     * </p>
     * @return
     */
    List<User> getUsers();

    /**
     * <p>
     *      Delete user
     * </p>
     * @param user - delete user
     */
    void deleteUser(User user);

    User getUserByUserName(String userName);
}
