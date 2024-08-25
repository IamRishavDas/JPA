package com.example.StudentDemoProject.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Scope("prototype")
@Entity
public class Student {
    @Id
    private int rollNo;
    private String name;
    private int marks;

    @Override
    public String toString(){
        return "Name: "+ this.name +" roll: " + this.rollNo + " marks: " + this.marks;
    }
}
