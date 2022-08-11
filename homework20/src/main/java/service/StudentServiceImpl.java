package service;

import bean.Student;
import db.DBService;
import db.DataSourceException;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private final DBService dbService = new DBService();

    @Override
    public void add(Student student) throws DataSourceException {
        dbService.insert(student);
    }

    @Override
    public void delete(Integer studentId) throws DataSourceException {
        dbService.deleteById(studentId);
    }

    @Override
    public List<Student> getAll() throws DataSourceException {
        return dbService.getAll();
    }

    @Override
    public List<Student> getByName(String name) throws DataSourceException {
        return dbService.getByName(name);
    }

    @Override
    public List<Student> getByIds(List<Integer> ids) throws DataSourceException {
        if (ids.size() < 3 || ids.size() > 3) {
            System.out.println("List must contain 3 values!");
            return null;
        }
        return dbService.getByIds(ids);
    }

}
