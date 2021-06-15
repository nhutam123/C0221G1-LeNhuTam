package model.repository;

import model.bean.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepo {
    private static final String SELECT_ALL="select * from table1;";
    BaseRepository baseRepository=new BaseRepository();
    public List<Student> selectAll(){
        List<Student> list=new ArrayList<>();
        try {
            Connection connection=baseRepository.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(SELECT_ALL);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                list.add(new Student(id,name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
