package com.tobeng.test.service;

import com.tobeng.test.dto.UserDTO;
import com.tobeng.test.entity.User;

import java.util.List;

public interface UserService {

    User saveUser(UserDTO userDTO);

    List<User> gatAllUser();

}
