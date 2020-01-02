package com.cp.mynote.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

/**
 * @author cp
 * @create 2019-12-30 13:53
 */
@Data
@Document(value = "notes")
public class Note implements Serializable {
    @Id
    @Field(value = "_id")
    String noteId;
    @Field(value = "NotebookId")
    String notebookId;
    @Field(value = "UserId")
    String userId;
    @Field(value = "Title")
    String title;
    @Field(value = "Tags")
    String[] tags;
    @Field(value = "Desc")
    String content;
    @Field(value = "IsMarkdown")
    boolean isMarkdown;
    @Field(value = "IsBlog")
    boolean isBlog;
    @Field(value = "IsTrash")
    boolean isTrash;
    NoteFile[] files;
    @Field(value = "CreatedTime")
    Date createdTime;
    @Field(value = "UpdatedTime")
    Date updatedTime;
}
