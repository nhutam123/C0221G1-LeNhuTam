package model.repository;

import model.bean.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private static final String SELECT_ALL_CUSTOMERS="select* from customer;";
    BaseRepository baseRepository=new BaseRepository();
    public List<Customer> selectAll() {
        List<Customer> list = new ArrayList<>();
        try (Connection connection = baseRepository.getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMERS)) {
            System.out.println(preparedStatement);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("customer_id");
                String name = rs.getString("customer_name");
                String birthday=rs.getString("birthday");
                String card=rs.getString("identify_card_number");
                String phoneNumber=rs.getString("phone_number");
                String email = rs.getString("Email");
                String address = rs.getString("address");
                int customerType=rs.getInt("customer_type_id");
                list.add(new Customer(id, name, birthday,card,phoneNumber,email,address,customerType));
            }
        } catch (SQLException e) {
            e.getErrorCode();
        }
        return list;
    }


}
