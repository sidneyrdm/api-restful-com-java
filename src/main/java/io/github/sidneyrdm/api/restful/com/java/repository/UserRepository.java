package io.github.sidneyrdm.api.restful.com.java.repository;

import io.github.sidneyrdm.api.restful.com.java.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
