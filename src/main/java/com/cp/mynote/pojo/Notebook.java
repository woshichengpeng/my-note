package com.cp.mynote.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

/**
 * @author cp
 * @create 2019-12-30 13:50
 */
@Data
@Document("notebooks")
public class Notebook implements Serializable {
    @Id
    String notebookId;
    @Field("UserId")
    String userId;
    @Field("ParentNotebookId")
    String parentNotebookId;
    @Field("Seq")
    int seq;
    @Field("Title")
    String title;
    @Field("IsBlog")
    boolean isBlog;
    @Field("IsDeleted")
    boolean isDeleted;
    @Field("CreatedTime")
    Date createdTime;
    @Field("UpdatedTime")
    Date updatedTime;
    //更新序号
    @Field("Usn")
    int usn;//UpdateSequenceNum;
}
