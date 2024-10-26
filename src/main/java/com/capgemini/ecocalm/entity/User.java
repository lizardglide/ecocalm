package com.capgemini.ecocalm.entity;

import com.capgemini.ecocalm.model.IndividualChallenge;
import com.capgemini.ecocalm.model.TeamChallenge;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String ecoScore;
    private IndividualChallenge individualChallenge;
    private List<String> stressManagementTools;
    private List<TeamChallenge> teamChallenges;
    private List<String> progress;


    @Override
    public String toString() {
        return id;
    }
}
