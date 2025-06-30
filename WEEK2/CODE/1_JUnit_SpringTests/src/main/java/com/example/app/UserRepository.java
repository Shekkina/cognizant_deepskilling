
package com.example.app;

import java.util.*;

public class UserRepository {
    private final Map<Long, User> db = new HashMap<>();

    public Optional<User> findById(Long id) {
        return Optional.ofNullable(db.get(id));
    }

    public List<User> findByName(String name) {
        List<User> result = new ArrayList<>();
        for (User user : db.values()) {
            if (user.getName().equalsIgnoreCase(name)) {
                result.add(user);
            }
        }
        return result;
    }

    public User save(User user) {
        db.put(user.getId(), user);
        return user;
    }
}
