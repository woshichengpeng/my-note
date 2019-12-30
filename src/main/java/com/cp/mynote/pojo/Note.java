package com.cp.mynote.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author cp
 * @create 2019-12-30 13:53
 */
@Data
public class Note implements Serializable {
    String NoteId;
    String NotebookId;
    String UserId;
    String Title;
    String[] Tags;
    String Content;
    boolean IsMarkdown;
    boolean IsBlog;
    boolean IsTrash;
    NoteFile[] Files;
    Date CreatedTime;
    Date UpdatedTime;
}
