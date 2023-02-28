package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void addStudent(Student student){
        studentRepository.saveStudent(student);
    }
    public void addTeacher(Teacher teacher){
        studentRepository.saveTeacher(teacher);
    }
    public void teacherStudentPair(String student_name, String teacher_name){
        studentRepository.makeStudentTeacherPair(student_name,teacher_name);
    }
    public Student getStudentByName(String student_name){
        return studentRepository.findStudentByName(student_name);
    }
    public Teacher getTeacherByName(String teacher_name){
        return studentRepository.findTeacherByName(teacher_name);
    }
    public List<String> getStudentsByTeacherName(String teacher_name){
        return studentRepository.findStudentsByTeacherName(teacher_name);
    }
    public List<String> getAllStudents(){
        return studentRepository.findAllStudents();
    }
    public void deleteTeacherByName(String teacher_name){
        studentRepository.deleteTeacherByName(teacher_name);
    }
    public void deleteAllTeachers(){
        studentRepository.deleteAllTeachers();
    }
}
