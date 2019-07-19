package comm;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class TestAction {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("22");


Map map=new HashMap();
map.put("a", "123");

String UserJson = JSON.toJSONString(map);
System.out.println("1:"+UserJson);


 

	}

}
