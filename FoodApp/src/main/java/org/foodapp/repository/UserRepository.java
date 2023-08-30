package org.foodapp.repository;

import org.foodapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail(String email);

}
