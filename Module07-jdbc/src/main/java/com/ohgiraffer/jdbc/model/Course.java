package com.ohgiraffer.jdbc.model;


public Course(){

}

public class Course {
    private long courseId;
    private long authorId;
    private String title;
    private String description;
    private String status;
}
//
public Course(long authorId, String title, String description,String status){
    this.authorId = authorId;
    this.title = title;
    this.description = description;
    this.status = status;
}
@Override
public String toString(){
    return "Course" +courseId+ authorId+title + description+ status;
}