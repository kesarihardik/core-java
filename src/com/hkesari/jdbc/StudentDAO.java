package com.hkesari.jdbc;
import java.lang.invoke.TypeDescriptor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//Class.forName  -- dynamically looks for driver at runtime

public class StudentDAO {

    String url = "jdbc:mysql://localhost:3306/student_tracker";
    String username = "springstudent";
    String pwd = "springstudent";

    public List<Student> getStudents() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,pwd);

            Statement statement = connection.createStatement();
            ResultSet resultSet =   statement.executeQuery("Select * from student");
            List<Student> studentList = new ArrayList<Student>();

            while(resultSet.next())
            {
                Integer id = resultSet.getInt(1);
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString(3);
                String email = resultSet.getString(4);
                Student student = new Student(id,firstName,lastName,email);
                studentList.add(student);
            }

            statement.close();
            connection.close();

            return studentList;

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public Student getStudent(int i) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,pwd);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from student where id = " + i);

            Student student = new Student();
            while(resultSet.next()){
                student.setId( resultSet.getInt(1));
                student.setFirstName(resultSet.getString(2));
                student.setLastName(resultSet.getString(3));
                student.setEmail(resultSet.getString(4));
            }
            statement.close();
            connection.close();
            return student;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
