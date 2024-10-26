package com.capgemini.ecocalm.service;

import com.capgemini.ecocalm.entity.Leaderboard;
import com.capgemini.ecocalm.entity.User;
import com.capgemini.ecocalm.repository.LeaderboardRepository;
import com.capgemini.ecocalm.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class LeaderboardService {

    private final UserRepository userRepository;
    private final LeaderboardRepository leaderboardRepository;

    @PostConstruct
    private void postconstruct() {
        updateLeaderboard();
    }

    @Scheduled(fixedRate = 86400000)
    private void updateLeaderboard() {
        List<User> topUsers = userRepository.findTop10ByOrderByEcoScoreDesc();

        Leaderboard leaderboard = new Leaderboard();
        leaderboard.setId("leaderboard");
        leaderboard.setLastUpdated(LocalDateTime.now());
        leaderboard.setTopUsers(topUsers);
        leaderboardRepository.save(leaderboard);
    }

}
