package service;

import bean.Student;

import java.util.List;

public interface StudentService {

    void add(Student student);

    void delete(Integer studentId);

    List<Student> getAll();

    List<Student> getByName(String name);

    List<Student> getByIds(List<Integer> ids);
}
