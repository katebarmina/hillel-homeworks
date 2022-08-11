package service;

import bean.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class StudentServiceImplTest {

    private final StudentService studentService = new StudentServiceImpl();

    @Test
    void add() {
        List<Student> students = studentService.getAll();
        int sizeBefore = students.size();
        studentService.add(new Student("Simon Simpson", 2, 2021));
        students = studentService.getAll();
        Assertions.assertEquals(sizeBefore + 1, students.size());
    }

    @Test
    void delete() {
        List<Student> students = studentService.getAll();
        int sizeBefore = students.size();
        studentService.delete(studentService.getByName("Simon Simpson").get(0).getId());
        students = studentService.getAll();
        Assertions.assertEquals(sizeBefore - 1, students.size());
    }

    @Test
    void getAll() {
        List<Student> students = studentService.getAll();
        Assertions.assertEquals(7, students.size());
    }

    @Test
    void getByName() {
        List<Student> students = studentService.getByName("Emma Watson");
        Assertions.assertEquals(1, students.size());
    }

    @Test
    void getByIds() {
        List<Student> students = studentService.getByIds(Arrays.asList(2, 5, 7));
        Assertions.assertEquals(3, students.size());
    }
}