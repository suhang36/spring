package springmvc;

import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
//@RequestMapping("/testSpring")
//@SessionAttributes(names= {"user"},types= {String.class})
@Controller
public class TestSpring {
	private static final String  SUCCESS="success";
	
	@Autowired
	HelloView helloView;	
	
	@RequestMapping("/testRedirect")
	public String testRedirect() {
		
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("/testView")
	public String testView() {
		System.out.println(helloView);
		return "helloView" ;
	}
	
	@ModelAttribute
	public String getUser(@RequestParam(name="id",required=false) Integer id,Map<String, Object> map) {
		User user=new User();
		user.setName("苏航");
		user.setPassword("123456");
		map.put("user", user);		
		return SUCCESS;
	}
	
	@RequestMapping("/testModeAttribute")
	public String testModeAttribute(User user) {
		
		System.out.println("map:"+user);
		
		return SUCCESS;
	}
	
	@RequestMapping("/testSessionAttribute")
	public String testSessionAttribute(Map<String, Object> map) {
		User user = new User();
		user.setName("苏航");
		user.setPassword("123456");
		map.put("user", user);
		map.put("address", "重庆工程学院");
		return SUCCESS;
	}
	
	@RequestMapping("/testMap")
	public String testMap(Map<String,Object> map){
		map.put("time", new Date());
		return SUCCESS;
	}
	@RequestMapping("/testModelAndView")
	public ModelAndView testModelAndView() {
		ModelAndView andView = new ModelAndView(SUCCESS);
		andView.addObject("date",new Date());
		System.out.println("testModelAndView:");
		return andView;
	}
	
	@RequestMapping("/testServletAPI")
	public void testServletAPI(Writer out) throws IOException {
		out.write("hello world");
	}
	
	@RequestMapping("/testPojo")
	public String testPojo(User user) {
		System.out.println(user);
		return SUCCESS;
	}
	
	@RequestMapping("/testCookieValue")
	public String testCookieValue(@CookieValue("JSESSIONID") String sessionid) {
		System.out.println("CookieValue："+sessionid);
		return SUCCESS;
	}
	
	@RequestMapping("testRequestParam")
	public String testRequestParams(@RequestParam(value="name") String name
			,@RequestParam(value="age",defaultValue="0",required=false) int age) {
		System.out.println("age:"+age+"name:"+name);
		return SUCCESS;
	}
	
	@RequestMapping(value="testRest/{id}",method=RequestMethod.GET)
	public String testRestGet(@PathVariable Integer id) {
		System.out.println("testRestGet"+id);
		return SUCCESS;
	}	
	
	@ResponseBody
	@RequestMapping(value="testRest/{id}",method=RequestMethod.DELETE)
	public String testRestDelete(@PathVariable Integer id) {
		System.out.println("testRestDelete"+id);
		return SUCCESS;
	}
	
	@ResponseBody
	@RequestMapping(value="testRest/{id}",method=RequestMethod.PUT)
	public String testRestPut(@PathVariable Integer id) {
		System.out.println("testRestPut"+id);
		return SUCCESS;
	}
	
	@RequestMapping(value="testRest",method=RequestMethod.POST)
	public String testRestPost() {
		System.out.println("testRestPost");
		return SUCCESS;
	}
	
	@RequestMapping("testVariable/{id}")
	public String testVaribale(@PathVariable("id") Integer id) {
		System.out.println("testRestGet"+id);
		return SUCCESS;
	}
	
	@RequestMapping(value="testParamsAndHeander",params= {"age=10"})
	public String testParamsAndHeander() {
		System.out.println("testParamsAndHeander");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testMethod",method=RequestMethod.POST)
	public String  testMethod() {
		System.out.println("testmethod");
		return SUCCESS;
	}
	
	@RequestMapping("/testRequestMapping")
	public String testRequestMapping() {
		
		return SUCCESS;
	}
	
	
}
