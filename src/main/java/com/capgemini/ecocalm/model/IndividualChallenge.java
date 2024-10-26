package com.capgemini.ecocalm.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class IndividualChallenge {

    private List<String> personalizedGoals;
    private List<String> gamification;
    private List<String> tasks;
    private Progress progress;
}
