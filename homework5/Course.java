import java.util.Objects;

public class Course {

    private Group[] groups = new Group[0];
    private int size = 0;
    private int courseNumber;
    private Faculty faculty;

    public Course() {
    }

    public void addGroup(Group group) {
        Group[] newGroups = new Group[groups.length + 1];
        System.arraycopy(groups, 0, newGroups, 0, groups.length);
        newGroups[newGroups.length - 1] = group;
        groups = newGroups;
        size++;
    }

    public Course(Group[] groups, int courseNumber, Faculty faculty) {
        this.groups = groups;
        this.size = size;
        this.courseNumber = courseNumber;
        this.faculty = faculty;
    }

    public Course(int courseNumber, Faculty faculty) {
        this.courseNumber = courseNumber;
        this.faculty = faculty;
    }


    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }


    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public String toString() {
        return "Course{" +
                "groups=" + groups +
                ", size=" + size +
                ", courseNumber=" + courseNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseNumber == course.courseNumber && Objects.equals(faculty, course.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseNumber, faculty);
    }
}
