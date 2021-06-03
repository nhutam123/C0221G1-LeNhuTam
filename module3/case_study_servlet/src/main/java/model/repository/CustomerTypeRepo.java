package model.repository;

import model.bean.CustomerType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepo  {
    private static final String SELECT_ALL="SELECT * FROM furuma.customer_type;";
    BaseRepository baseRepository=new BaseRepository();
    public List<CustomerType> selectAll(){
        List<CustomerType> list= new ArrayList<>();
        try{
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(SELECT_ALL);
            System.out.println(statement);
            // Step 3: Execute the query or update query
            ResultSet rs = statement.executeQuery();
            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("customer_type_id");
                String type = rs.getString("customer_type");
                list.add(new CustomerType(id,type));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }


}
