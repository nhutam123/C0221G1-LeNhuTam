package model.repository;

import model.bean.RentalType;
import model.bean.Service;
import model.bean.ServiceType;
import model.service.RentalTypeService;
import model.service.ServiceTypeService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepo {
    private static  final  String SELECT_ID="select* from service where service_id=?;";
    private static final  String SELECT_ALL="select* from service;";
    private static final String INSERT="insert into service(service_name,using_area,max_customer,price,rental_type_id,service_type_id,`status`)\n" +
            "values(?,?,?,?,?,?,?);";
    BaseRepository baseRepository=new BaseRepository();
    ServiceTypeService typeService=new ServiceTypeService();
    RentalTypeService rentalTypeService=new RentalTypeService();

    public Service selectService(int id){
        Service service=null;
        try {
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(SELECT_ID);
            statement.setInt(1,id);
            ResultSet rs=statement.executeQuery();
            while (rs.next()){
                String name=rs.getString("service_name");
                int area =rs.getInt("using_area");
                double price=rs.getDouble("price");
                int maxCustomer=rs.getInt("max_customer");
                ServiceType type=typeService.selectServiceType(rs.getInt("service_type_id"));
                RentalType rentalType=rentalTypeService.selectRentalType(rs.getInt("rental_type_id"));
                int status=rs.getInt("status");
                service=new Service(id,name,area,price,maxCustomer,type,rentalType,status);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return service;
    }

    public void insertService(Service service){
        try {
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(INSERT);
            statement.setString(1,service.getName());
            statement.setInt(2,service.getArea());
            statement.setInt(3,service.getMaxCustomer());
            statement.setDouble(4,service.getPrice());
            statement.setInt(5,service.getRentalType().getId());
            statement.setInt(6,service.getType().getId());
            statement.setInt(7,service.getStatus());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Service> selectAll(){
        List<Service> list=new ArrayList<>();
        try {
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(SELECT_ALL);
            ResultSet rs=statement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("service_id");
                String name=rs.getString("service_name");
                int area =rs.getInt("using_area");
                double price=rs.getDouble("price");
                int maxCustomer=rs.getInt("max_customer");
                ServiceType type=typeService.selectServiceType(rs.getInt("service_type_id"));
                RentalType rentalType=rentalTypeService.selectRentalType(rs.getInt("rental_type_id"));
                int status=rs.getInt("status");
                list.add(new Service(id,name,area,price,maxCustomer,type,rentalType,status));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
