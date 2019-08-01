package com.bee.mapper;

import com.bee.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by niujinliang on 2019/3/12.
 */
@Mapper
public interface UserMapper {
    public int register(User user);
}
