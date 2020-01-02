package com.cp.mynote.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @author cp
 * @create 2020-01-02 15:20
 */
@Data
@Document("tokens")
public class Token {
    @Id
    Object userId;
    @Field("Email")
    String email;
    @Field("Token")
    String token;
    @Field("Type")
    int type;
    @Field("CreatedTime")
    Date createdTime;
}
