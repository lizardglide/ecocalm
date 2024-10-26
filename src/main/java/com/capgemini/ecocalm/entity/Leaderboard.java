package com.capgemini.ecocalm.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Document(collection = "leaderboard")
public class Leaderboard {
    @Id
    private String id;
    private LocalDateTime lastUpdated;
    private List<User> topUsers;
}
