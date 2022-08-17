package service;

import bean.Student1;
import db.DBService;
import db.DataSourceException;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl1 implements StudentService1 {

    private final DBService dbService = new DBService();

    @Override
    public void add(Student1 student) throws DataSourceException {
        dbService.insert(student);
    }

    @Override
    public void delete(Integer studentId) throws DataSourceException {
        dbService.deleteById(studentId);
    }

    @Override
    public List<Student1> getAll() throws DataSourceException {
        return dbService.getAll();
    }

    @Override
    public List<Student1> getByName(String name) throws DataSourceException {
        return dbService.getByName(name);
    }

    @Override
    public List<Student1> getByIds(List<Integer> ids) throws DataSourceException {
        List<Student1> students = new ArrayList<>();
        for (Integer id: ids) {
            students.add(dbService.getById(id));
        }
        return students;
    }

}
