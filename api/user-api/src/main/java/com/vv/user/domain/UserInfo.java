package com.vv.user.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.sql.DataSourceDefinition;
import java.io.Serializable;

@Data
@Setter
@Getter
@TableName("userinfo")
public class UserInfo implements Serializable {
    public static final int GENDER_SECRET = 0;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_NORMAL = 3;

    //@TableId: 用于标识实体类中的主键字段。
    //type = IdType.AUTO: 指定主键的生成策略，这里是自动递增。
    // 这意味着当插入一条记录时，数据库会自动为该字段生成一个唯一的递增值，
    // 通常用于标识唯一性的主键。
    @TableId(type = IdType.AUTO)
    private Long id;

    private String nickname;

}
