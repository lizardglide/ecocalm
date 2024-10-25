package com.capgemini.ecocalm.data;

import com.capgemini.ecocalm.UserRepository;
import com.capgemini.ecocalm.document.User;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class DataInitializer {

    private final UserRepository userRepository;

    @Bean
    public CommandLineRunner loadData(UserRepository userRepository) {
        return args -> {
            userRepository.deleteAll();
            userRepository.save(User.builder().name("Megatron").email("cybertron.mail").build());
            userRepository.save(User.builder().name("Optimus Prime").email("cybertron.mail").build());
            System.out.println("Data loaded to Fongo!");
            userRepository.findAll().forEach(System.out::println);
        };
    }
}
