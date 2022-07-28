package com.ahmad.sfusermanagement.repositories;

import com.ahmad.sfusermanagement.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long> {
}
