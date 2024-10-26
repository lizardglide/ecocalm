package com.capgemini.ecocalm.repository;

import com.capgemini.ecocalm.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    List<User> findTop10ByOrderByEcoScoreDesc();
}
