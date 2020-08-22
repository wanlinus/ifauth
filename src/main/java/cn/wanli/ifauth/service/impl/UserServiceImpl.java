package cn.wanli.ifauth.service.impl;

import cn.wanli.ifauth.domain.User;
import cn.wanli.ifauth.persistence.UserRepository;
import cn.wanli.ifauth.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;


    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
}
