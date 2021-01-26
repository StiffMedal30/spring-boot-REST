package za.co.dotze.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.dotze.model.User;


/**
 * Author - Christiaan Dotze <christiaan@dotze.co.za>
 * Date   - 24 January 2021
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUsersByFirstName(String userName);


}
