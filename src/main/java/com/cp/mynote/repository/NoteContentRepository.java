package com.cp.mynote.repository;

import com.cp.mynote.pojo.noteInfo.NoteContent;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author cp
 * @create 2020-01-02 14:22
 */
public interface NoteContentRepository extends MongoRepository<NoteContent, String> {
}
