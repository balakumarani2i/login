package com.ideas2it.login.dao.impl;

import com.ideas2it.login.dao.UserDao;
import com.ideas2it.login.model.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class UserDaoImpl extends GenericDaoImpl implements UserDao {

    /**
     * {@inheritDoc}
     */
    @Transactional
    public User saveUser(User user) {
        return (User) getSession().merge(user);
    }

    /**
     * {@inheritDoc}
     */
    @Transactional
    public User updateUser(User user) {
        return (User) getSession().merge(user);
    }

    /**
     * {@inheritDoc}
     */
    @Transactional
    public User getUserById(Long id) {
        Criteria criteria = getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("id", id));
        return (User) criteria.uniqueResult();
    }

    /**
     * {@inheritDoc}
     */
    @Transactional
    @SuppressWarnings("unchecked")
    public List<User> getUsers() {
        Criteria criteria = getSession().createCriteria(User.class);
        return criteria.list();
    }

    /**
     * {@inheritDoc}
     */
    @Transactional
    public void deleteUser(User user) {
        getSession().delete(user);
    }

    @Transactional
    @Override
    public User getUserByUserName(String userName) {
        Criteria criteria = getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("userName", userName));
        return (User) criteria.uniqueResult();
    }
}
