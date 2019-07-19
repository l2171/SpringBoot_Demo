package comm;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloHappyBKsController {
	
	

	    @RequestMapping(value = "/hello",method = RequestMethod.GET)
	    public String sayHello(){
	        return "Hello! I am HappyBKs, from Oschina new ! !123！";
	    }
	    

@RequestMapping("/one")
public void index( Model model,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

	
	//request.getRequestDispatcher("index.jsp").forward(request, response);
	//重定向，重新请求地址
	response.sendRedirect(request.getContextPath()+"index.jsp");
  
	}
@RequestMapping("/")
public String index( Model model, HttpServletResponse response)  {

	//这里不起作用因为前面用的restController，会自动返回字符串，而忽略跳转
	
   return "redirect:/index.jsp";


	}


@RequestMapping("/to")
public ModelAndView queryAll(){
	ModelAndView model = new ModelAndView();
    model.setViewName("forward:index.jsp");    //你要跳转html的名字
    return model;
}

@RequestMapping(value="/html",produces= {"text/html;charset=UTF-8"})
public void queryHtml(PrintWriter writer){
	
	writer.write("<html><ul><li>hello</li></ul></html>"+"");
	
	
}

@RequestMapping(value="/html1")
public String queryHtml1( ){
	
	return("<html><ul><li>hello html</li></ul></html>"+"");
	
	
}


}




