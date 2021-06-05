package model.repository;

import model.bean.CustomerType;
import model.bean.Department;
import model.bean.Position;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepo {
    private static final String SELECT_ALL="select* from department;";
    private static final String SELECT_DEPARTMENT="select* from department where department_id=?;";

    BaseRepository baseRepository=new BaseRepository();
    public List<Department> selectAll(){
        List<Department> list=new ArrayList<>();
        try{
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(SELECT_ALL);
            System.out.println(statement);
            // Step 3: Execute the query or update query
            ResultSet rs = statement.executeQuery();
            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("department_id");
                String type = rs.getString("department");
                list.add(new Department(id,type));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public Department selectDpartment(int id){
        Department department=null;
        try {
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(SELECT_DEPARTMENT);
            statement.setInt(1,id);
            ResultSet rs=statement.executeQuery();
            while (rs.next()){
                String name=rs.getString("department");
                department=new Department(id,name);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return department;
    }
}
