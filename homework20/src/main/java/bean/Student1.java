package bean;

import java.util.Objects;

public class Student1 {
    private Integer id;
    private String fullName;
    private Integer groupId;
    private Integer year;

    public Student1() {
    }


    public Student1(String fullName, Integer groupId, Integer year) {
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
    public int hashCode() {
        return Objects.hash(fullName, groupId, year);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student = (Student1) o;
        return Objects.equals(id, student.id) && Objects.equals(fullName, student.fullName) && Objects.equals(groupId, student.groupId) && Objects.equals(year, student.year);
    }
}
