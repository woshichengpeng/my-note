package com.cp.mynote.pojo;

import lombok.Data;

import java.io.Serializable;


/**
 * @author cp
 * @create 2019-12-30 13:42
 */
@Data
public class User implements Serializable {
    String UserId;
    String Username;
    String Email;
    boolean Verified;
    String Logo;
}
