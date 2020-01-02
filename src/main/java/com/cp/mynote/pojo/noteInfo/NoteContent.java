package com.cp.mynote.pojo.noteInfo;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

/**
 * @author cp
 * @create 2019-12-30 13:56
 */
@Data
@Document("note_contents")
public class NoteContent implements Serializable {
    @Id
    ObjectId noteId;
    @Field("UserId")
    ObjectId userId;

    @Field("IsBlog")
    boolean isBlog;

    @Field("Content")
    String content;
    @Field("Abstract")
    String _abstract;

    @Field(value = "CreatedTime")
    Date createdTime;
    @Field(value = "UpdatedTime")
    Date updatedTime;
    @Field("UpdatedUserId")
    ObjectId updatedUserId;// 如果共享了, 并可写, 那么可能是其它他修改了

}
