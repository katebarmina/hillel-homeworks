
public class University {
    public static void main(String[] args) {
        Faculty computerScience = new Faculty("Computer Science");
        Course secondCourse = new Course(2, computerScience);
        computerScience.addCourse(secondCourse);
        Student[] students = new Student[10];
        Group cs22 = new Group("CS22", secondCourse);
        secondCourse.addGroup(cs22);
        students[0] = new Student(234098345L, "Smith", "Sam", "Henry", 2003, "44 Kaneohe Bay Dr\nKaneohe, Hawaii(HI), 96744", "202-555-0110", computerScience, secondCourse, cs22);
        students[1] = new Student(234098356L, "Wilson", "Emma", "Anna", 2001, "44 Kaneohe Bay Dr\nKaneohe, Hawaii(HI), 96767", "202-534-0190", computerScience, secondCourse, cs22);
        students[2] = new Student(234098459L, "Brown", "Tom", "Julian", 1999, "7801 Peninsula Expy\nDundalk, Maryland(MD), 21222", "202-534-0178", computerScience, secondCourse, cs22);
        students[3] = new Student(234098323L, "Bond", "James", "Wilson", 2002, "44 Kaneohe Bay Dr\nKaneohe, Hawaii(HI), 96798", "202-534-0987", computerScience, secondCourse, cs22);
        students[4] = new Student(234099870L, "Pitt", "Brad", "Charlie", 2001, "44 Kaneohe Bay Dr\nKaneohe, Hawaii(HI), 96723", "202-534-6534", computerScience, secondCourse, cs22);
        cs22.addStudent(students[0]);
        cs22.addStudent(students[1]);
        cs22.addStudent(students[2]);
        cs22.addStudent(students[3]);
        cs22.addStudent(students[4]);

        Faculty psychology = new Faculty("Psychology");
        Course thirdCourse = new Course(3, psychology);
        Course firstCourse = new Course(1, psychology);
        psychology.addCourse(thirdCourse);
        psychology.addCourse(firstCourse);
        Student[] psychologyStudents = new Student[5];
        Group ps31 = new Group(psychologyStudents, "PS31", thirdCourse);
        Group ps12 = new Group(psychologyStudents, "PS12", firstCourse);
        thirdCourse.addGroup(ps31);
        firstCourse.addGroup(ps12);
        students[5] = new Student(234090987L, "Watson", "Megan", "Laura", 1998, "44 Kaneohe Bay Dr\nKaneohe, Hawaii(HI), 96666", "202-555-9876", psychology, thirdCourse, ps31);
        students[6] = new Student(234091234L, "Wilson", "Emma", "Anna", 2001, "44 Kaneohe Bay Dr\nKaneohe, Hawaii(HI), 96444", "202-534-2345", psychology, firstCourse, ps12);
        students[7] = new Student(234090587L, "Depp", "Johnny", "Julian", 1995, "7801 Peninsula Expy\nDundalk, Maryland(MD), 21333", "200-534-0178", psychology, thirdCourse, ps31);
        students[8] = new Student(234093855L, "Bradley", "Couper", "Wilson", 2002, "44 Kaneohe Bay Dr\nKaneohe, Hawaii(HI), 96222", "211-534-0987", psychology, firstCourse, ps12);
        students[9] = new Student(2340999345L, "Mayers", "Michael", "Charlie", 2000, "44 Kaneohe Bay Dr\nKaneohe, Hawaii(HI), 96111", "299-533-6534", psychology, thirdCourse, ps31);
        ps12.addStudent(students[5]);
        ps12.addStudent(students[6]);
        ps12.addStudent(students[7]);
        ps12.addStudent(students[8]);
        ps12.addStudent(students[9]);

        printStudentsOfTheFaculty(computerScience, students);
        printStudentsOfTheFacultyAndNeededCourse(psychology, students, thirdCourse);
        printStudentsBornAfterThatYear(2001, students);
        printGroup(cs22);


    }

    private static void printStudentsOfTheFaculty(Faculty faculty, Student[] students) {
        System.out.println("Students of the " + faculty.getName() + " faculty");
        for (Student student : students) {
            if (student.getFaculty().equals(faculty))
                System.out.println(student);
        }
    }

    private static void printStudentsOfTheFacultyAndNeededCourse(Faculty faculty, Student[] students, Course course) {
        System.out.println("Students of the " + faculty.getName() + " faculty and " + course.getCourseNumber() + " course");
        for (Student student : students) {
            if (student.getFaculty().equals(faculty) && student.getCourse().equals(course)) System.out.println(student);
        }
    }

    private static void printStudentsBornAfterThatYear(int year, Student[] students) {
        System.out.println("Student born after " + year);
        for (Student student : students) {
            if (student.getYearOfBirth() > year) System.out.println(student);
        }
    }

    private static void printGroup(Group group) {
        System.out.println("Student of the " + group.getName() + " group");
        System.out.println(group);
    }
}
