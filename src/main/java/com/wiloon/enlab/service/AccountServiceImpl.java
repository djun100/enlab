package com.wiloon.enlab.service;

import com.wiloon.enlab.core.dao.IGenericDao;
import com.wiloon.enlab.core.service.impl.GenericService;
import com.wiloon.enlab.entity.User;

/**
 * Created with IntelliJ IDEA.
 * User: wiloon
 * Date: 1/6/13
 * Time: 4:45 PM
 */
public class AccountServiceImpl extends GenericService<User, Long> implements AccountService {

    public AccountServiceImpl(IGenericDao<User, Long> genericDao) {
        super(genericDao);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public User findUserByName(String userName, char[] password) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(new String(password));
        User usr = genericDao.getObject("findByNameAndPassword", user);
        if (user != null) {
            logger.debug("account service, find user:" + usr.getUserName() + "/" + usr.getPassword());
        }
        return usr;
    }
}
