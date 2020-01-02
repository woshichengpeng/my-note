package com.cp.mynote.pojo;

import lombok.Data;

/**
 * @author cp
 * @create 2020-01-02 15:15
 */
@Data
public class Re {
    boolean OK;
    int code;
    String msg;
    String id;
    Object list;
    Object item;

    public Re() {
        this.OK = false;
    }

}
