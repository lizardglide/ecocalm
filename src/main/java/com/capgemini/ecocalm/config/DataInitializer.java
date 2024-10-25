package com.capgemini.ecocalm.config;

import com.capgemini.ecocalm.model.Goal;
import com.capgemini.ecocalm.entity.User;
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
                    .personalizedGoals(List.of(
                            addGoal("Reducing water Usage"),
                            addGoal("Cycling"),
                            addGoal("Minimize plastic")
                    ))
                    .build());
            System.out.println("Data loaded to Fongo!");
            userRepository.findAll().forEach(user -> System.out.println(user.getId()));
        };
    }

    private Goal addGoal(String goal) {
        return Goal.builder().goal(goal).build();
    }
}
