package cn.itcast.contoller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//控制器类
@Controller
public class HelloController {
    @RequestMapping(path = "/hello")//请求的映射
    public String sayHello(){
//        想要执行这个方法，就得创建对象，可以在配置文件中进行配置
        System.out.println("Hello,SpringMVC!");
        return "successed";
    }
}
