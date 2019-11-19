package service;

import org.springframework.stereotype.Service;
import po.User;

import java.util.List;

/**
 * Author:yzf
 * Date:2019/10/29 13:53
 * projectName:Mybatis
 **/
@Service
public interface Userservice {
    public List<User> show();
}
