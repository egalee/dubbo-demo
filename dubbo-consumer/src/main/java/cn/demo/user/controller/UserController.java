package cn.demo.user.controller;

import cn.demo.UserApi;
import cn.demo.dto.UserDTO;
import com.alibaba.fastjson.JSONObject;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class UserController {

    @DubboReference(version = "1.0.0")
    private UserApi userApi;

    @RequestMapping("/index")
    public String index() {
        UserDTO userDTO = userApi.get(1133L);
        return JSONObject.toJSONString(userDTO);
    }
}
