package model.repository;

import model.bean.Customer;
import model.bean.CustomerType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepo {
    private static final String SELECT_ALL = "SELECT * FROM customer_type;";
    private static final String SELECT_TYPE="SELECT * FROM customer_type where customer_type_id=?;";
    private static final String SEARCH_CUSTOMER_SQL = "select * from customer\n" +
            "where customer.customer_name like ?;";
    BaseRepository baseRepository = new BaseRepository();

    public List<CustomerType> selectAll() {
        List<CustomerType> list = new ArrayList<>();
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            System.out.println(statement);
            // Step 3: Execute the query or update query
            ResultSet rs = statement.executeQuery();
            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("customer_type_id");
                String type = rs.getString("customer_type");
                list.add(new CustomerType(id, type));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public CustomerType selectType(int id) {
        CustomerType type = null;
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement statement = connection.prepareStatement(SELECT_TYPE);
            statement.setInt(1, id);
            System.out.println(statement);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String name=rs.getString("customer_type");
                type=new CustomerType(id,name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return type;
    }
}