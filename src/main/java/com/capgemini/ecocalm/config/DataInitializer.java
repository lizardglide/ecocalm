package com.capgemini.ecocalm.config;

import com.capgemini.ecocalm.entity.User;
import com.capgemini.ecocalm.model.Goal;
import com.capgemini.ecocalm.model.IndividualChallenge;
import com.capgemini.ecocalm.model.Progress;
import com.capgemini.ecocalm.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@RequiredArgsConstructor
@Configuration
public class DataInitializer {

    private final UserRepository userRepository;

    @Bean
    public CommandLineRunner loadData(UserRepository userRepository) {
        return args -> {
            userRepository.deleteAll();
            userRepository.save(User.builder().name("Megatron").email("cybertron.mail").build());

            userRepository.save(User.builder()
                    .name("Optimus Prime")
                    .email("cybertron.mail")
                    .individualChallenge(
                            IndividualChallenge.builder()
                                    .personalizedGoals(List.of(
                                            "Reducing water Usage",
                                            "Cycling",
                                            "Minimize plastic"
                                    ))
                                    .gamification(List.of("Earning points", "Receiving Budges"))
                                    .tasks(List.of("Clean your room", "GROW UP", "Cook dinner", "use public transport"))
                                    .progress(Progress.builder()
                                            .co2Saved("22W")
                                            .electricityConsumptionReduction("40 kwh/day")
                                            .build())
                                    .build()
                    )
                    .build());


            System.out.println("Data loaded to Fongo!");
            userRepository.findAll().forEach(user -> System.out.println(user.getId()));
        };
    }


//     .personalizedGoals(List.of(
//            addGoal("Reducing water Usage"),
//    addGoal("Cycling"),
//    addGoal("Minimize plastic")
//                    ))

   /* "teamChallenges":[
            [
            "communityInvolvement":["stuff","stuff","stuff"],
            "leaderboard":["stuff","stuff","stuff"],
            "teamFormation":["stuff","stuff"],
            "sharedChallenges":["challenge","challenge","challenge"],
            "rewardSystem":["reward","reward"]
            ],

            [
            "communityInvolvement":["stuff","stuff","stuff"],
            "leaderboard":["stuff","stuff","stuff"],
            "teamFormation":["stuff","stuff"],
            "sharedChallenges":["challenge","challenge","challenge"],
            "rewardSystem":["reward","reward"]
            ]
            ]
*/
    // private List<TeamChallenge> teamChallenges;
//   private List<String> communityInvolvement;
//    private List<String> leaderboard;
//    private List<String> teamFormation;
//    private List<String> sharedChallenges;
//    private List<String> rewardSystem;

    private Goal addGoal(String goal) {
        return Goal.builder().goal(goal).build();
    }
}
