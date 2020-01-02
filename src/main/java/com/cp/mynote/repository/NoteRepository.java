package com.cp.mynote.repository;

import com.cp.mynote.pojo.noteInfo.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author cp
 * @create 2020-01-02 13:02
 */
public interface NoteRepository extends MongoRepository<Note, String> {
    Note findByTitle(String title);
}
