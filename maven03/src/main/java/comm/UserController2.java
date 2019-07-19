package comm;



import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comm.mapper.UserMapper;




@RestController
public class UserController2 {
	
	@Resource  // 注入SqlSessionTemplate对象  
    private SqlSessionTemplate sqlSessionTemplate; 
    //显示用户
    @RequestMapping("/list2")
    public List index() throws Exception {
    	List list=sqlSessionTemplate.selectList("comm.mapper.UserMapper.getUser");
    	
        return list;
    }
  
}