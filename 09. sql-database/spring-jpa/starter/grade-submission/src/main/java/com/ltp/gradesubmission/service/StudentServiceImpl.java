package com.ltp.gradesubmission.service;

import com.ltp.gradesubmission.repository.StudentRepository;
import java.util.List;

import com.ltp.gradesubmission.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student getStudent(Long id) {
        return null;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {        
    }

    @Override
    public List<Student> getStudents() {
        return null;
    }


}