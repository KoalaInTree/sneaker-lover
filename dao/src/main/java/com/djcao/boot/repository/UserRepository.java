package com.djcao.boot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @author djcao
 * @workcode wb-cdj390654
 * @date 2019-07-03
 */
public interface UserRepository extends CrudRepository<User,Long> {

    @Query(value = "select * from user where phone_num = ?1 or email = ?2 limit 1",nativeQuery = true)
    User findByPhoneNumOrEmail(Integer phoneNumber,String email);
}
