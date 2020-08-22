package cn.wanli.ifauth.controller.restful;

import cn.wanli.ifauth.domain.User;
import cn.wanli.ifauth.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping
    public List<User> list(){
        return userService.list();
    }

}
