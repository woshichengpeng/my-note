package com.cp.mynote.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author cp
 * @create 2019-12-30 13:50
 */
@Data
public class Notebook implements Serializable {
    String NotebookId;
    String UserId;
    String ParentNotebookId;
    int Seq;
    String Title;
    boolean IsBlog;
    boolean IsDeleted;
    Date CreatedTime;
    Date UpdatedTime;

    //更新序号
    int Usn;//UpdateSequenceNum;
}
