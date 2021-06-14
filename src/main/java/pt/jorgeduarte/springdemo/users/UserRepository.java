package pt.jorgeduarte.springdemo.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    //@Query("SELECT s FROM User s WHERE s.Username = ?1")
    Optional<User> findUserByUsername(String username);

    //List<User> findByUsername

}
