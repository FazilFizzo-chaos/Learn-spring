package com.example.learn_jpa_and_hibernate.course.jdbc;


import com.example.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static final String INSERT_QUERY = "INSERT INTO course (id, name, author) VALUES(?, ?, ?)";
    private static final String Delete_QUERY = " DELETE FROM course WHERE id = ?";

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY,
                course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id) {
        springJdbcTemplate.update(Delete_QUERY,id);
    }
}
