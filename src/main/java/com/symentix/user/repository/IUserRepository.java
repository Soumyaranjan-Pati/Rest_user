package com.symentix.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.symentix.user.dto.User;

@Repository
@Transactional
public interface IUserRepository extends MongoRepository<User,Integer>{

}
