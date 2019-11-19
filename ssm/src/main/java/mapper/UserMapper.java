package mapper;

import org.springframework.stereotype.Repository;
import po.User;

import java.util.List;

/**
 * Author:yzf
 * Date:2019/10/29 13:46
 * projectName:Mybatis
 **/

@Repository
public interface UserMapper {


    public List<User> show();

}
