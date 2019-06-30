package com.djcao.boot.service;

import com.djcao.boot.entity.UserEntity;

/**
 * @author djcao
 * @workcode wb-cdj390654
 * @date 2019-06-29
 */
public interface UserService {

    UserEntity getById(Long id);
}
