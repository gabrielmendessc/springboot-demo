package com.gabrielmendes.course.services;

import com.gabrielmendes.course.entities.User;
import com.gabrielmendes.course.repositories.UserRepository;
import com.gabrielmendes.course.services.execeptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user){
        return userRepository.save(user);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }

    public User update(Long id, User user){
        User userEntity = userRepository.getById(id);
        updateData(userEntity, user);

        return userRepository.save(userEntity);
    }

    private void updateData(User userEntity, User user) {
        userEntity.setName(user.getName());
        userEntity.setEmail(user.getEmail());
        userEntity.setPhone(user.getPhone());
    }
}
