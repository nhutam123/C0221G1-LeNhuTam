package model.repository;

import model.bean.Department;
import model.bean.Position;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionRepo {
    private static final String SELECT_ALL="select* from position_employee;";
    private static final String SELECT_POSITION="select * from position_employee where position_id=?;";
    BaseRepository baseRepository=new BaseRepository();
    public List<Position> selectAll(){
        List<Position> list=new ArrayList<>();
        try{
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(SELECT_ALL);
            System.out.println(statement);
            // Step 3: Execute the query or update query
            ResultSet rs = statement.executeQuery();
            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("position_id");
                String type = rs.getString("position_name");
                list.add(new Position(id,type));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public Position selectPosition(int id){
        Position position=null;
        try {
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(SELECT_POSITION);
            statement.setInt(1,id);
            ResultSet rs=statement.executeQuery();
            while (rs.next()){
                String name=rs.getString("position");
                position=new Position(id,name);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return position;
    }
}
