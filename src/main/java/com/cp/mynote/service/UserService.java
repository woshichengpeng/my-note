package com.cp.mynote.service;

import com.cp.mynote.pojo.User;
import com.cp.mynote.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.acl.LastOwnerException;
import java.util.Optional;


/**
 * @author cp
 * @create 2020-01-02 20:45
 */
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    User getUserInfo(String userId) {
        Optional<User> user = userRepository.findById(userId);
        setUserLogo(user.get());
        return user.get();
    }

    void setUserLogo(User user) {
        if (user.getLogo() == "") {
            user.setLogo("images/blog/default_avatar.png");
        }
        //取得logo后面的/ 且保证前面有/
        if (user.getLogo() != "" && !user.getLogo().contains("http")) {
            String logo = user.getLogo();
            if (logo.endsWith("/")) {
                logo = logo.substring(0, logo.length() - 1);
            }
            if (!logo.startsWith("/")) {
                logo = "/" + logo;
            }
            user.setLogo(logo);
        }
    }
}
