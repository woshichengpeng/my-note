package com.cp.mynote.pojo.noteInfo;

import lombok.Data;
import org.bson.types.ObjectId;

import java.util.Date;

/**
 * @author cp
 * @create 2020-01-02 15:49
 */
@Data
public class EachHistory {
    ObjectId updatedUserId;
    Date updatedTime;
    String content;
}
