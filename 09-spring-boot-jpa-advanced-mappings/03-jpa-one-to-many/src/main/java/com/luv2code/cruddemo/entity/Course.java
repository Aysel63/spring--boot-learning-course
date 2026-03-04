package com.luv2code.cruddemo.entity;
@Entity
@Tablle(name="course")
public class Course {

    // define our fields

    // define constructors

    // define getter setter

    // define toString

    // annotate fields

    @Id
    @GeneratedValue(strategy=GeneretionType.Identity)
    @Column(name="id")
    private int id;

    private String title;

    private Instructor instructor;

    public Course(){}

    public Course(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", id=" + id +
                '}';
    }
}
