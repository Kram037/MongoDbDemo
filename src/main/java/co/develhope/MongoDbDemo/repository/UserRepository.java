package co.develhope.MongoDbDemo.repository;

import co.develhope.MongoDbDemo.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
