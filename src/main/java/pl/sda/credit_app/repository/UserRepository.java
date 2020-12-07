package pl.sda.credit_app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.credit_app.model.User;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {
}
