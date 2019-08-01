package com.bee.service;

import com.bee.entity.User;
import com.bee.mapper.UserMapper;
import com.bee.vo.ResponseObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

/**
 * Created by niujinliang on 2019/3/12.
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public ResponseObj register(User user){
        ResponseObj responseObj = new ResponseObj();
        try{
            int i = userMapper.register(user);
            if(i==1){
                responseObj.setSuccess(true);
            }else{
                responseObj.setMsg("注册失败，请联系管理员");
                responseObj.setSuccess(false);
            }
        }catch (DuplicateKeyException duplicateKeyException){
                responseObj.setMsg("用户名重复，请重新注册");
                responseObj.setSuccess(false);
                duplicateKeyException.printStackTrace();
        }catch (Exception e){
                responseObj.setMsg("注册失败，请联系管理员");
                responseObj.setSuccess(false);
                e.printStackTrace();
        }
        return responseObj;
    }
}
