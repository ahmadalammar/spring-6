package com.alammar.spring6.repo;

import com.alammar.spring6.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileRepositoryImp implements UserProfileRepository {
    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<UserProfile> rowMapper = (rs, rowNum) -> new UserProfile(
            rs.getString("Id"),
            rs.getString("name"),
            rs.getString("email"),
            rs.getString("address"));

    @Autowired
    public UserProfileRepositoryImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<UserProfile> findAll() {
        // Text Block JEP 378, released in Java 15+
        String findAllUsers = """
                select * 
                from UserProfile
                """;
        return jdbcTemplate.query(findAllUsers, rowMapper);
    }

    @Override
    public String findById(String Id) {
        throw new IllegalStateException("not supported yet");
    }
}
