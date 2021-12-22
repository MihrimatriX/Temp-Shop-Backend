package com.afu.business.concretes;

import com.afu.business.abstracts.UserService;
import com.afu.core.dataaccess.UserDao;
import com.afu.core.entities.User;
import com.afu.core.utilities.results.DataResult;
import com.afu.core.utilities.results.Result;
import com.afu.core.utilities.results.SuccessDataResult;
import com.afu.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanici Eklendi");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.findByEmail(email), "Kullanici Bulundu");
    }
}
