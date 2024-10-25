package com.capgemini.ecocalm;

import com.capgemini.ecocalm.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
