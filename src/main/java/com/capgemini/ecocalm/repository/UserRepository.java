package com.capgemini.ecocalm.repository;

import com.capgemini.ecocalm.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
