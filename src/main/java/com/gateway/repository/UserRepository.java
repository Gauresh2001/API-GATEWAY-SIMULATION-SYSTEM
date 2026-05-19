package com.gateway.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gateway.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
