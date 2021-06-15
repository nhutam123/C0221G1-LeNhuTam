package model.repository;

import model.bean.RentalType;
import model.bean.ServiceType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RentalTypeRepo {
    private static final String SELECT_ALL="select* from rental_type;";
    private static final String SELECT_RENTAL="select* from rental_type where rental_type_id=?;";
    BaseRepository baseRepository=new BaseRepository();


    public RentalType selectRentalType(int id) {
        RentalType rentalType = null;
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement statement = connection.prepareStatement(SELECT_RENTAL);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("rental_type");
                double price=rs.getDouble("price");

                rentalType = new RentalType(id, name,price);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rentalType;
    }
    public List<RentalType> selectAll(){
        List<RentalType> list=new ArrayList<>();
        try {
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(SELECT_ALL);
            ResultSet rs=statement.executeQuery();
            while (rs.next()){
                int id=rs.getInt("rental_type_id");
                String name=rs.getString("rental_type");
                double price=rs.getDouble("price");
                list.add(new RentalType(id,name,price));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
