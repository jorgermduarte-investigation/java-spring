package pt.jorgeduarte.springdemo.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( path = "api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService _userService) {
        this.userService = _userService;
    }

    @GetMapping
    public List<User> GetUsers(){
        return this.userService.getUsers();
    }

    @GetMapping(path = "{userId}")
    public User GetUserById(@PathVariable("userId") long userId){
        return this.userService.GetUserById(userId);
    }

    @PostMapping
    public long CreateNewUser(User user){
        return this.userService.AddNewUser(user);
    }

    @GetMapping( path = "helloworld")
    public String GetHelloWorld(){
        return this.userService.GetHelloWorld();
    }


}
