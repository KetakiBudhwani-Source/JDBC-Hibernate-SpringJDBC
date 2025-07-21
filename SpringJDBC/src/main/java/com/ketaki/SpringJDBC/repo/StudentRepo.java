package com.ketaki.SpringJDBC.repo;

import com.ketaki.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student){
        String query = "insert into student (rollno,name,marks) values (?,?,?)";

        //update is similar to execute update in jdbc
       int rows= jdbc.update(query,student.getRollNo(),student.getName(),student.getMarks());
        System.out.println(rows+" effected");
    }

    public List<Student> findAll() {
//        List<Student> students = new ArrayList<>();
//        return students;
        String query ="select * from student";

        //Anonymous class
//        RowMapper<Student> mapper = new RowMapper<Student>() {
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student s = new Student();
//                s.setRollNo(rs.getInt("rollno"));
//                s.setName(rs.getString("name"));
//                s.setMarks(rs.getInt("marks"));
//                return s;
//            }
//        };

        //As Lambda
//
//        RowMapper<Student> mapper = (rs,rowNum)-> {
//
//                Student s = new Student();
//                s.setRollNo(rs.getInt("rollno"));
//                s.setName(rs.getString("name"));
//                s.setMarks(rs.getInt("marks"));
//                return s;
//        };
////
//       return jdbc.query(query, mapper);
        return jdbc.query(query,(rs,rowNum)-> {

            Student s = new Student();
            s.setRollNo(rs.getInt("rollno"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));
            return s;
        });
    }
}
