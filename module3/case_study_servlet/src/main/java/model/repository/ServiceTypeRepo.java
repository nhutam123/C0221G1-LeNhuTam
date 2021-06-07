package model.repository;

import model.bean.Service;
import model.bean.ServiceType;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ServiceTypeRepo {
    BaseRepository repository=new BaseRepository();
    private static final String SELECT_ALL ="SELECT * FROM service_type;";
    private static final String SELECT_TYPE="SELECT * FROM service_type where service_type_id=?;";
    public List<ServiceType> selectAll(){
        List<ServiceType> list=new ArrayList<>();
        try {
            Connection connection=repository.getConnection();
            PreparedStatement statement=connection.prepareStatement(SELECT_ALL);
            ResultSet rs=statement.executeQuery();
            while (rs.next()){
                int id=rs.getInt("service_type_id");
                String name=rs.getString("service_type");
                list.add(new ServiceType(id,name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public ServiceType selectType(int id){
        ServiceType type=null;
        try {
            Connection connection=repository.getConnection();
            PreparedStatement statement=connection.prepareStatement(SELECT_TYPE);
            statement.setInt(1,id);
            ResultSet rs=statement.executeQuery();
            while (rs.next()){
                String name=rs.getString("service_type");
                type=new ServiceType(id,name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return type;
    }
}
