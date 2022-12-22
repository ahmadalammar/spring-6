package com.alammar.spring6.repo;

import com.alammar.spring6.model.UserProfile;

import java.util.List;

// we will not use JpaRepository bcoz Records cannot be Entities,
// see: https://stackoverflow.com/questions/70601508/can-i-use-java-16-record-with-jpa-entity
public interface UserProfileRepository {
    List<UserProfile> findAll();
    String findById(String Id);
}
