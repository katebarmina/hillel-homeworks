package service;

import bean.Student1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class StudentServiceImplTest1 {

    private final StudentService1 studentService = new StudentServiceImpl1();

    @Test
    void add() {
        List<Student1> students = studentService.getAll();
        int sizeBefore = students.size();
        studentService.add(new Student1("Simon Simpson", 2, 2021));
        students = studentService.getAll();
        Assertions.assertEquals(sizeBefore + 1, students.size());
    }

    @Test
    void delete() {
        List<Student1> students = studentService.getAll();
        int sizeBefore = students.size();
        studentService.delete(studentService.getByName("Simon Simpson").get(0).getId());
        students = studentService.getAll();
        Assertions.assertEquals(sizeBefore - 1, students.size());
    }

    @Test
    void getAll() {
        List<Student1> students = studentService.getAll();
        Assertions.assertEquals(7, students.size());
    }

    @Test
    void getByName() {
        List<Student1> students = studentService.getByName("Emma Watson");
        Assertions.assertEquals(1, students.size());
    }

    @Test
    void getByIds() {
        List<Student1> students = studentService.getByIds(Arrays.asList(2, 5, 7,1));
        Assertions.assertEquals(4, students.size());
    }
}