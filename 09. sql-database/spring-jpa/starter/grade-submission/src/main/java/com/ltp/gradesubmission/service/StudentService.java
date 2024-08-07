package com.ltp.gradesubmission.service;

import com.ltp.gradesubmission.entity.Course;
import java.util.List;

import com.ltp.gradesubmission.entity.Student;
import java.util.Set;

public interface StudentService {
    Student getStudent(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getStudents();
    Set<Course> getEnrolledCourses(Long id);
}