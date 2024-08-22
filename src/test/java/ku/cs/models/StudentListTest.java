package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList studentList = new StudentList();

    @BeforeEach
    void init() {
        studentList.addNewStudent("6000000001", "adam", 50);
        studentList.addNewStudent("6000000002", "john", 60);
        studentList.addNewStudent("6000000003", "cena", 70);
    }

    @Test
    void testAddNewStudent() {
        StudentList studentList1 = new StudentList();
        studentList1.addNewStudent("6000000001", "adam", 50);
        studentList1.addNewStudent("6000000002", "john", 60);
        studentList1.addNewStudent("6000000003", "cena", 70);

        assertEquals("adam", studentList1.findStudentById("6000000001").getName());
        assertEquals("john", studentList1.findStudentById("6000000002").getName());
        assertEquals("cena", studentList1.findStudentById("6000000003").getName());
    }

    @Test
    void testFindStudentById() {
        Student student = studentList.findStudentById("6000000001");
        assertEquals("adam", student.getName());
    }

    @Test
    void testGiveScoreToId() {
        studentList.giveScoreToId("6000000001", 50);
        studentList.giveScoreToId("6000000002", 50);
        studentList.giveScoreToId("6000000003", 50);
        assertEquals(100, studentList.findStudentById("6000000001").getScore());
        assertEquals(110, studentList.findStudentById("6000000002").getScore());
        assertEquals(120, studentList.findStudentById("6000000003").getScore());
    }

    @Test
    void testViewGradeOfId() {
        assertEquals("D", studentList.viewGradeOfId("6000000001"));
        assertEquals("C", studentList.viewGradeOfId("6000000002"));
        assertEquals("B", studentList.viewGradeOfId("6000000003"));
    }


}