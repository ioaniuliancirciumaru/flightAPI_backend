package com.codecool.flight_api_project.user;


import com.codecool.flight_api_project.flight.FlightModel;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    public void addUser(User user){
        userRepository.insertUser(user);
    }

    public List<User> list(){
        return userRepository.findAll();
    }
}
