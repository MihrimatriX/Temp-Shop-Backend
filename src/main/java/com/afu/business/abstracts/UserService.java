package com.afu.business.abstracts;

import com.afu.core.entities.User;
import com.afu.core.utilities.results.DataResult;
import com.afu.core.utilities.results.Result;

public interface UserService {
    Result add(User user);
    DataResult<User> findByEmail(String email);
}
