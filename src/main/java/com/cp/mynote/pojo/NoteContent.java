package com.cp.mynote.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author cp
 * @create 2019-12-30 13:56
 */
@Data
public class NoteContent implements Serializable {
    String NoteId;
    String UserId;
    String Content;
}
