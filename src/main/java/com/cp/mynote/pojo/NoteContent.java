package com.cp.mynote.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * @author cp
 * @create 2019-12-30 13:56
 */
@Data
@Document("note_contents")
public class NoteContent implements Serializable {
    @Id
    String noteId;
    @Field("UserId")
    String userId;
    @Field("Content")
    String content;
}
