package com.aoao.demo.psdemo1.Controller;

import com.aoao.demo.psdemo1.Service.UserService;
import com.aoao.demo.psdemo1.Util.psdemo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getAll")
    public List<psdemo1> getAll(Map map){
        return userService.getAll(map);
    }
}
