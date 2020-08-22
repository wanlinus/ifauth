package cn.wanli.ifauth.controller.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping({"/", "/index"})
    public String index() {
        return "if-auth";
    }
}
