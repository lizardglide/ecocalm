package com.capgemini.ecocalm.repository;

import com.capgemini.ecocalm.entity.Leaderboard;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LeaderboardRepository extends MongoRepository<Leaderboard, String> {

}
