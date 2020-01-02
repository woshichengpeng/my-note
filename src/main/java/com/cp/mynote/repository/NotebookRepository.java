package com.cp.mynote.repository;

import com.cp.mynote.pojo.Notebook;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author cp
 * @create 2020-01-02 14:23
 */
public interface NotebookRepository extends MongoRepository<Notebook, String> {
}
