package com.cp.mynote.repository;

import com.cp.mynote.pojo.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author cp
 * @create 2020-01-02 14:20
 */
public interface TagRepository extends MongoRepository<Tag,String> {
}
