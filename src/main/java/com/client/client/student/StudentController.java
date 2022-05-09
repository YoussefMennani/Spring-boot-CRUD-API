package com.client.client.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping("/")
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable Long studentId){
        studentService.deleteStudent(studentId);
    }

    @PutMapping("/{studentId}")
    public void updateStudent(
            @PathVariable Long studentId,
            @RequestBody Student student
    ){
      studentService.updateStudent(studentId, student.getName(), student.getEmail());
    }

}
