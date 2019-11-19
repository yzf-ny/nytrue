package service;

import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.User;

import java.util.List;

/**
 * Author:yzf
 * Date:2019/10/29 13:54
 * projectName:Mybatis
 **/
@Service
public class UserserviceImpl implements  Userservice {


    private UserMapper mapper;

    @Autowired
    public void setMapper(UserMapper mapper) {
        System.out.println("mapper:"+mapper);
        this.mapper = mapper;
    }

    @Override
    public List<User> show() {
        return mapper.show();
    }

//    public static void main(String[] args) {
//
//        UserserviceImpl u=new UserserviceImpl();
//        u.show();
//    }
}
