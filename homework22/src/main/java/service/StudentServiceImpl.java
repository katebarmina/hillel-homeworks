package service;

import bean.Student;
import db.DataSourceException;
import db.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private final SessionFactory factory = HibernateUtil.getFactory();

    @Override
    public void add(Student student) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(Integer studentId) throws DataSourceException {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        Student deletedSt = session.get(Student.class, studentId);
        session.delete(deletedSt);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Student> getAll() throws DataSourceException {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List<Student> students = session.createQuery("from Student").list();
        session.getTransaction().commit();
        session.close();
        return students;
    }

    @Override
    public List<Student> getByName(String name) throws DataSourceException {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List<Student> students = session.createQuery("from Student where fullName = '" + name + "'").list();
        session.getTransaction().commit();
        session.close();
        return students;
    }

    @Override
    public List<Student> getByIds(List<Integer> ids) throws DataSourceException {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List<Student> students = new ArrayList<>();
        for (Integer id : ids) {
            students.add(session.get(Student.class, id));
        }
        session.getTransaction().commit();
        session.close();
        return students;
    }

}
