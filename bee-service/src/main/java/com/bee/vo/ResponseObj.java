package com.bee.vo;

import lombok.Data;

/**
 * Created by niujinliang on 2019/3/12.
 */
@Data
public class ResponseObj {
    private String msg;
    private Integer code;
    private boolean success;
    private Object obj;

}
