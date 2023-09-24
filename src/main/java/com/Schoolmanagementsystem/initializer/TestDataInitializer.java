package com.Schoolmanagementsystem.initializer;

import com.Schoolmanagementsystem.model.Courses;
import com.Schoolmanagementsystem.model.Student;
import com.Schoolmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class TestDataInitializer implements ApplicationRunner {

    private final StudentRepository studentRepository;

    @Autowired
    public TestDataInitializer(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception{
        Student student1 = new Student("Duran", LocalDate.of(1967,8,8),"Ankara", 'E');
        Courses course1=new Courses("Mathematics","M1", 10);


        course1.setStudent(student1);

        studentRepository.save(student1);

    }
}
