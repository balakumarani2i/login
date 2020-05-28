package com.ideas2it.login.service.impl;

import com.ideas2it.login.dao.UserDao;
import com.ideas2it.login.model.User;
import com.ideas2it.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    private PasswordEncoder passwordEncoder;

    @Autowired
    @Qualifier("passwordEncoder")
    public void setPasswordEncoder(final PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    /**
     * {@inheritDoc}
     */
    public User saveUser(User user) {
        return userDao.saveUser(setEncodedPassword(user));
    }

    /**
     * <p>
     *     Encodes user given password and saves
     * </p>
     * @param user - user object
     * @return user - object with encoded password
     */
    private User setEncodedPassword(User user) {
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return user;
    }

    /**
     * {@inheritDoc}
     */
    public User updateUser(User user) {
        return userDao.updateUser(user);
    }

    /**
     * {@inheritDoc}
     */
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    /**
     * {@inheritDoc}
     */
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    /**
     * {@inheritDoc}
     */
    public User deactivateUser(Long id) {
        User user = userDao.getUserById(id);
        user.setIsActive(Boolean.FALSE);
        return userDao.updateUser(user);
    }

    @Override
    public User getUserByUserName(String userName) {
        return null;
    }
}
