package com.capgemini.ecocalm.service;

import com.capgemini.ecocalm.entity.User;
import com.capgemini.ecocalm.model.TeamChallenge;

import java.util.List;

public interface UserService {
    List<TeamChallenge> getPersonalizedTeamChallenges(User user);
}
