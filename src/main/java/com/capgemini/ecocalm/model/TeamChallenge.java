package com.capgemini.ecocalm.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TeamChallenge {
    private List<String> communityInvolvement;
    private List<String> leaderboard;
    private List<String> teamFormation;
    private List<String> sharedChallenges;
    private List<String> rewardSystem;
}
