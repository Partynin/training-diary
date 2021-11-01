package bk.partinin.trainingdiary.repository;

import bk.partinin.trainingdiary.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
