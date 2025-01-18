package org.example.springapi.service;

import org.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> users;

    public UserService() {
        users = new ArrayList<>();

        User user1 = new User(1, "luffy", "luffy@gmail.com",20);
        User user2 = new User(2, "zoro", "zoro@gmail.com",21);
        User user3 = new User(3, "sanji", "sanji@gmail.com",22);
        User user4 = new User(4, "nami", "nami@gmail.com",23);
        User user5 = new User(5, "usopp", "usopp@gmail.com",24);

        users.addAll(List.of(user1, user2, user3, user4, user5));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user : users) {
            if (user.getId() == id) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }

}
