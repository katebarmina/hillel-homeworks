package service;

import bean.Student1;
import db.DataSourceException;

import java.util.List;

public interface StudentService1 {
    void add(Student1 student) throws DataSourceException;

    void delete(Integer studentId) throws DataSourceException;

    List<Student1> getAll() throws DataSourceException;

    List<Student1> getByName(String name) throws DataSourceException;

    List<Student1> getByIds(List<Integer> ids) throws DataSourceException;
}
