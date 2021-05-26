package com.nocdib.amigoscode.springboot.student;

import java.time.LocalDate;
import lombok.Data;

@Data
public class Student {
  private Long id;
  private String name, email;
  private LocalDate dob;
  private Integer age;

  public Student(String name, String email, LocalDate dob, Integer age) {
    this.name = name;
    this.email = email;
    this.dob = dob;
    this.age = age;
  }

  public Student(Long id, String name, String email, LocalDate dob, Integer age) {
    this(name, email, dob, age);
    this.id = id;
  }



}
