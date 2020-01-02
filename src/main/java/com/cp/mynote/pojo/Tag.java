package com.cp.mynote.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

/**
 * @author cp
 * @create 2019-12-30 14:00
 */
@Data
@Document(value = "tag_count")
public class Tag implements Serializable {
    @Id
    @Field(value = "_id")
    String tagID;
    @Field(value = "UserId")
    String userId;
    @Field(value = "Tag")
    String tag;
    Date createdTime;
    Date updatedTime;
    boolean isDeleted;
    //更新序号
    int usn;//UpdateSequenceNum;
}
