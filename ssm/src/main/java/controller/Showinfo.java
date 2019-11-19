package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import po.User;
import service.Userservice;

import java.util.List;

/**
 * Author:yzf
 * Date:2019/10/29 13:56
 * projectName:Mybatis
 **/
@Controller
public class Showinfo {

    private Userservice user;

    @Autowired
    public void setUser(@Qualifier("userservice") Userservice user1) {
        this.user = user1;
    }

    @ResponseBody
    @RequestMapping("/show")
    public List<User> show()
    {
        List<User> list=user.show();
        System.out.println("size()="+list.size());
        return list;
    }

    @RequestMapping("/jumpshow")
    public String jump()
    {
      return "show";
    }
}
