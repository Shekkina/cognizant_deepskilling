
package com.example.app;

public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
