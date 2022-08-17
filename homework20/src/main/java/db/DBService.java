package db;

import bean.Student1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBService {

    private final String INSERT_SQL = "INSERT INTO students (full_name,group_id,year) VALUES (?,?,?)";
    private final String DELETE_BY_ID_SQL = "DELETE FROM students WHERE student_id = ?;";
    private final String SELECT_SQL = "SELECT * FROM students;";
    private final String SELECT_BY_NAME_SQL = "SELECT * FROM students WHERE full_name = ?;";
    private final String SELECT_BY_ID_SQL = "SELECT * FROM students WHERE student_id = ?";


    public void insert(Student1 student) throws DataSourceException {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hillel", "root", "12345");
             PreparedStatement statement = connection.prepareStatement(INSERT_SQL)) {
            statement.setString(1, student.getFullName());
            statement.setLong(2, student.getGroupId());
            statement.setInt(3, student.getYear());
            statement.execute();

        } catch (SQLException ex) {
            throw new DataSourceException("Couldn't insert student", ex);
        }
    }


    public void deleteById(Integer studentId) throws DataSourceException {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hillel", "root", "12345");
             PreparedStatement statement = connection.prepareStatement(DELETE_BY_ID_SQL)) {
            statement.setLong(1, studentId);
            statement.execute();
        } catch (SQLException ex) {
            throw new DataSourceException("Couldn't delete student", ex);
        }
    }

    public List<Student1> getAll() throws DataSourceException {
        List<Student1> students = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hillel", "root", "12345");
             PreparedStatement statement = connection.prepareStatement(SELECT_SQL)) {
            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    Student1 student = new Student1();
                    student.setId(rs.getInt(1));
                    student.setFullName(rs.getString(2));
                    student.setGroupId(rs.getInt(3));
                    student.setYear(4);
                    students.add(student);
                }
            }
        } catch (SQLException ex) {
            throw new DataSourceException("Couldn't get students", ex);
        }
        return students;
    }

    public List<Student1> getByName(String name) throws DataSourceException {
        List<Student1> students = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hillel", "root", "12345");
             PreparedStatement statement = connection.prepareStatement(SELECT_BY_NAME_SQL)) {
            statement.setString(1, name);
            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    Student1 student = new Student1();
                    student.setId(rs.getInt(1));
                    student.setFullName(rs.getString(2));
                    student.setGroupId(rs.getInt(3));
                    student.setYear(rs.getInt(4));
                    students.add(student);
                }
            }
        } catch (SQLException ex) {
            throw new DataSourceException("Couldn't get students by name", ex);
        }
        return students;
    }

    public Student1 getById(Integer id) throws DataSourceException {
        Student1 student = new Student1();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hillel", "root", "12345");
             PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID_SQL)) {
            statement.setInt(1, id);
            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    student.setId(rs.getInt(1));
                    student.setFullName(rs.getString(2));
                    student.setGroupId(rs.getInt(3));
                    student.setYear(rs.getInt(4));
                }
            }
        } catch (SQLException ex) {
            throw new DataSourceException("Couldn't get student by id", ex);
        }
        return student;
    }
}

