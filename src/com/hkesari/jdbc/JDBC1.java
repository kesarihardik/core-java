package com.hkesari.jdbc;
import java.sql.*;
import java.util.List;

//7 steps
//load the package -> load & register the package. (class.forName()) -> establish the connection
//create  the statement ->  execute->   process-> close the connection
public class JDBC1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        StudentDAO studentDAO = new StudentDAO();
        List<Student> studentList = studentDAO.getStudents();

//        for (Student st:studentList
//             ) {
//            System.out.println(st);
//        }

        Student student = studentDAO.getStudent(1);
        System.out.println(student);
    }

}
