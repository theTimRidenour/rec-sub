package com.entertainment.recsub.Model.Data;

import org.springframework.data.repository.CrudRepository;

import com.entertainment.recsub.Model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
