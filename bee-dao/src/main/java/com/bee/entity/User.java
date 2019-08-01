package com.bee.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by niujinliang on 2019/3/11.
 */
@Data
public class User {
    private Integer id;
    @NotBlank(message="用户名不能为空")
    private String userName;
    @NotBlank(message="密码不能为空")
    private String password;

}
