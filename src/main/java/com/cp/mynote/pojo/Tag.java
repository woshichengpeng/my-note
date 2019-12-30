package com.cp.mynote.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author cp
 * @create 2019-12-30 14:00
 */
@Data
public class Tag implements Serializable {
    String TagID;
    String UserId;
    String Tag;
    Date CreatedTime;
    Date UpdatedTime;
    boolean IsDeleted;
    //更新序号
    int Usn;//UpdateSequenceNum;
}
