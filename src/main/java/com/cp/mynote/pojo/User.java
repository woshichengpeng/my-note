package com.cp.mynote.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;


/**
 * @author cp
 * @create 2019-12-30 13:42
 */
@Data
@Document(value = "users")
public class User implements Serializable {
    @Id
    String userId;
    @Field(value = "Username")
    String username;
    @Field(value = "Email")
    String email;
    @Field(value = "Verified")
    boolean verified;
    @Field(value = "Logo")
    String logo;

    public User() {
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
