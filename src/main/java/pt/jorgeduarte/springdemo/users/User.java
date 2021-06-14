package pt.jorgeduarte.springdemo.users;
import javax.persistence.*;

@Entity
@Table
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long Id;
    private String Username;
    private String Password;
    private String Nickname;

    public User(String username, String password) {
        Username = username;
        Password = password;
    }

    public User(String username, String password, String nickname) {
        Username = username;
        Password = password;
        Nickname = nickname;
    }

    public Long getId() {
        return Id;
    }

    @Override
    public String toString() {
        return "User{" +
                "Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", Nickname='" + Nickname + '\'' +
                '}';
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }
}
