package bean;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "group_id")
    private Integer groupId;

    @Column(name = "year")
    private Integer year;

    public Student() {
    }


    public Student(String fullName, Integer groupId, Integer year) {
        this.fullName = fullName;
        this.groupId = groupId;
        this.year = year;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(fullName, student.fullName) && Objects.equals(groupId, student.groupId) && Objects.equals(year, student.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, groupId, year);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", groupId=" + groupId +
                ", year=" + year +
                '}';
    }
}
