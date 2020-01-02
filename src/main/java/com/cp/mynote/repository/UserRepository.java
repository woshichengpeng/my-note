package com.cp.mynote.repository;

import com.cp.mynote.pojo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author cp
 * @create 2020-01-02 11:34
 */
public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);

    void deleteByEmail(String email);
}
