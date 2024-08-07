package com.ltp.gradesubmission.service;

import com.ltp.gradesubmission.entity.Student;
import java.util.List;

import com.ltp.gradesubmission.entity.Course;
import java.util.Set;

public interface CourseService {
    Course getCourse(Long id);
    Course saveCourse(Course course);
    void deleteCourse(Long id);
    List<Course> getCourses();
    Set<Student> getEnrolledStudents(Long id);
    Course addStudentsToCourse(Long studentId, Long courseId);
}