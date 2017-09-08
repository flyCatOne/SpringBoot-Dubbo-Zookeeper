package cn.teaey.sprintboot.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HelloWorldController {

	@Autowired
	AbcService AbcService;
	
    @RequestMapping("/1")
    public String sayHello() {
    	return AbcService.echoService.echo("sss");
    }
}
