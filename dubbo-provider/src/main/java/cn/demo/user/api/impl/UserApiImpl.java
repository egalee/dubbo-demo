package cn.demo.user.api.impl;

import cn.demo.UserApi;
import cn.demo.dto.UserDTO;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0")
public class UserApiImpl implements UserApi {

    @Override
    public UserDTO get(Long id) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);
        userDTO.setUserName("name" + id.toString());
        return userDTO;
    }
}
