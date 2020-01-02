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
 * @create 2019-12-30 13:53
 */
@Data
@Document(value = "notes")
//笔记信息 没有内容
public class Note implements Serializable {
    @Id
    @Field(value = "_id")
    ObjectId noteId;
    @Field(value = "NotebookId")
    ObjectId notebookId;
    @Field(value = "CreatedUserId")
    ObjectId createdUserId;
    @Field(value = "UserId")
    ObjectId userId;
    @Field(value = "Title")
    String title;
    @Field(value = "Desc")
    String desc;

    @Field("Src")
    String src;

    @Field("ImgSrc")
    String imgSrc;
    @Field(value = "Tags")
    String[] tags;

    @Field(value = "IsTrash")
    boolean isTrash;

    @Field(value = "IsBlog")
    boolean isBlog;
    @Field("UrlTitle")
    String urlTitle;
    @Field("IsRecommend")
    boolean isRecommend;
    @Field("IsTop")
    boolean isTop;
    @Field("HasSelfDefined")
    boolean hasSelfDefined;


    @Field(value = "IsMarkdown")
    boolean isMarkdown;

    @Field("AttachNum")
    int attachNum;

    @Field(value = "CreatedTime")
    Date createdTime;
    @Field(value = "UpdatedTime")
    Date updatedTime;
    @Field("RecommendTime")
    Date recommendTime;// 推荐时间
    @Field("PublicTime")
    Date publicTime; // 发表时间, 公开为博客则设置
    @Field("UpdatedUserId")
    ObjectId updatedUserId;// 如果共享了, 并可写, 那么可能是其它他修改了

    @Field("Usn")
    int usn;

    @Field("IsDeleted")
    boolean isDeleted;//删除位
}

