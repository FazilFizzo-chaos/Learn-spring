package com.example.learn_jpa_and_hibernate.course.jdbc;

import com.example.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
      repository.insert(new Course(1, "Learn AWS", "FIZO"));
      repository.insert(new Course(2, "Learn Git", "Fazil"));
      repository.insert(new Course(3, "Learn Docker", "Veer"));
      repository.insert(new Course(4, "Learn Project Management", "Abbubakar"));

      repository.deleteById(3);
    }
}
