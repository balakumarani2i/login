package com.ideas2it.login.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class GenericDaoImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public SessionFactory getSessionFactory() {
        return this.entityManager.unwrap(SessionFactory.class);
    }

    public Session getValidSession() {
        Session session = entityManager.unwrap(Session.class);
        return session;
    }

    public Session getSession() throws HibernateException {
        Session session = getValidSession();
        return session;
    }
}
