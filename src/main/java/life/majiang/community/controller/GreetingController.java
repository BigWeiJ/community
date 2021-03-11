package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")   //通过mapping注解路由到对应的方法
    public String greeting(@RequestParam(name="name",required = false,defaultValue = "world")String name, Model model) {
        model.addAttribute("name", name);   //将浏览器中传递过来的name参数值，放到spring容器model中
        return "greeting";    //会到templates文件夹下找到与返回值同名的html文件
    }
}
