package com.capgemini.ecocalm.service.impl;

import com.capgemini.ecocalm.entity.User;
import com.capgemini.ecocalm.model.TeamChallenge;
import com.capgemini.ecocalm.repository.UserRepository;
import com.capgemini.ecocalm.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<TeamChallenge> getPersonalizedTeamChallenges(User user) {
        return user.getTeamChallenges();
    }
}
