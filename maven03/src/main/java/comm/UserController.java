package comm;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comm.mapper.UserMapper;




@RestController
public class UserController {
	
	 @Autowired
	    public UserMapper userMapper;
    //显示用户
    @RequestMapping("/list")
    public List index() throws Exception {
    	List list=userMapper.getUser();
    	
        return list;
    }
    //删除用户
    @RequestMapping("delete/{id}")
    public String delete(@PathVariable int id) throws Exception {
      
        return "你已经删掉了id为"+id+"的用户";
    }
    //增加用户
    @RequestMapping("addUser")
    public String addUser() throws Exception {
      
        return "增加用户";
    }
}