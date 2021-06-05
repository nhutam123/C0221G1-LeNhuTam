package model.repository;

import model.bean.Degree;
import model.bean.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DegreeRepo {
    private static final String SELECT_ALL="select* from degree;";
    private static final String SELECT_DEGREE="select * from degree where degree_id=/;";
    BaseRepository baseRepository=new BaseRepository();
    public List<Degree> selectAll(){
        List<Degree> list=new ArrayList<>();
        try{
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(SELECT_ALL);
            System.out.println(statement);
            // Step 3: Execute the query or update query
            ResultSet rs = statement.executeQuery();
            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("degree_id");
                String type = rs.getString("degree");
                list.add(new Degree(id,type));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public Degree selectDegree(int id){
        Degree degree=null;
        try{
            Connection connection =baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(SELECT_DEGREE);
            statement.setInt(1,id);
            ResultSet rs=statement.executeQuery();
            while (rs.next()){
                String name=rs.getString("degree");
                degree=new Degree(id,name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return degree;
    }
}
