package com.cp.mynote.pojo.noteInfo;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @author cp
 * @create 2020-01-02 15:46
 */
@Data
@Document("note_content_histories")
public class NoteContentHistory {
    @Id
    ObjectId noteId;
    @Field("UserId")
    ObjectId userId;
    @Field("Histories")
    EachHistory[] histories;

}
