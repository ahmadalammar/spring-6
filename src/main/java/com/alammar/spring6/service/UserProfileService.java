package com.alammar.spring6.service;

import com.alammar.spring6.model.UserProfile;
import com.alammar.spring6.repo.UserProfileRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileService {
    private final UserProfileRepositoryImp userRepositoryImp;

    @Autowired
    public UserProfileService(UserProfileRepositoryImp userRepositoryImp) {
        this.userRepositoryImp = userRepositoryImp;
    }

    public List<UserProfile> findAllUsers() {
        return userRepositoryImp.findAll();
    }
}
