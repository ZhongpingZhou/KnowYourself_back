package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorld 
{
	private static final String SUCCESS = "success";
	@RequestMapping("/HelloWorld")
	public String sayHello()
	{
		System.out.println("Hello");
		return SUCCESS;
	}

}
