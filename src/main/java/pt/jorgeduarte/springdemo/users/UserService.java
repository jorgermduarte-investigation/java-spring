package pt.jorgeduarte.springdemo.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){ return this.userRepository.findAll(); }
    public User GetUserById(long userId){ return this.userRepository.getById(userId); }

    public long AddNewUser(User user){
        Optional<User> userOptional = this.userRepository.findUserByUsername(user.getUsername());
        if(userOptional.isPresent()){
            throw new IllegalStateException("username taken");
        }
        this.userRepository.save(user);
        return user.getId();
    }

    public Optional<User> GetUserByUsername(String username){
        return this.userRepository.findUserByUsername(username);
    }

    public String GetHelloWorld(){
        return "Hello World";
    }



}
