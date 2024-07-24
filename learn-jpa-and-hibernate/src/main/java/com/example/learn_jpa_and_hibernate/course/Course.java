package com.example.learn_jpa_and_hibernate.course;

public class Course {
    private long id;
    private String name;
    private String author;

    public Course() {

    }

    public Course(long id, String name, String author){
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public long getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Course [id=" +id + ", name=" + name + ", author=" + author + "]";
    }
}
