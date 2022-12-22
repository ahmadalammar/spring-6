package com.alammar.spring6;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.alammar.spring6.model.UserProfile;
import com.alammar.spring6.repo.UserProfileRepositoryImp;
import com.alammar.spring6.service.UserProfileService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class UserProfileServiceTests {

    @Mock
    private UserProfileRepositoryImp userProfileRepositoryImp;
    @InjectMocks
    private UserProfileService userProfileService;

    @Test
    public void testGetAllUsers() {
        when(userProfileRepositoryImp.findAll()).thenReturn(List.of(
                new UserProfile("1", "alammar", "alammar@gmail.com", "Malaysia"),
                new UserProfile("2", "jack", "jack@gmail.com", "Malaysia")));
        List<UserProfile> userProfiles = userProfileService.findAllUsers();
        Assertions.assertTrue(userProfiles.size() == 2);
    }
}
