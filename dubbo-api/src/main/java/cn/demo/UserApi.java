package cn.demo;

import cn.demo.dto.UserDTO;

public interface UserApi {
    UserDTO get(Long id);
}
