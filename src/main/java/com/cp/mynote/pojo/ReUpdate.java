package com.cp.mynote.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author cp
 * @create 2019-12-30 14:03
 * <p>
 * 更新返回的值，包括 Usn
 */
@Data
public class ReUpdate implements Serializable {
    boolean OK;
    String Msg;
    int Usn;
}
