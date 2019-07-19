package comm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface  UserMapper {
	

	    //获取用户名单
	    public List getUser() throws Exception;
	  
	

}
