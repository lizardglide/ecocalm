package com.capgemini.ecocalm.controller;

import com.capgemini.ecocalm.entity.Leaderboard;
import com.capgemini.ecocalm.repository.LeaderboardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/v1")
@RestController
public class LeaderboardController {

    private final LeaderboardRepository leaderboardRepository;

    @GetMapping("/leaderboard")
    public ResponseEntity<Leaderboard> getLeaderboard() {
        return leaderboardRepository.findById("leaderboard")
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
