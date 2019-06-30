package com.djcao.boot.repository;

import com.djcao.boot.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author djcao
 * @workcode wb-cdj390654
 * @date 2019-06-29
 */
@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long>{
}
