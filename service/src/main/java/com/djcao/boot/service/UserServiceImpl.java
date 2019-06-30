package com.djcao.boot.service;

import javax.annotation.Resource;

import com.djcao.boot.entity.UserEntity;
import com.djcao.boot.repository.UserRepository;
import org.springframework.stereotype.Service;

/**
 * @author djcao
 * @workcode wb-cdj390654
 * @date 2019-06-29
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public UserEntity getById(Long id) {
        return userRepository.findById(id).orElse(new UserEntity());
    }
}
