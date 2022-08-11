package service;

import bean.Student;
import db.DataSourceException;

import java.util.List;

public interface StudentService {
    void add(Student student) throws DataSourceException;

    void delete(Integer studentId) throws DataSourceException;

    List<Student> getAll() throws DataSourceException;

    List<Student> getByName(String name) throws DataSourceException;

    List<Student> getByIds(List<Integer> ids) throws DataSourceException;
}
