package model.repository;

import model.bean.Customer;
import model.bean.CustomerType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepo  {
    private static final String SELECT_ALL="SELECT * FROM furuma.customer_type;";
    private  static final String SEARCH_CUSTOMER_SQL="select * from customer\n" +
            "where customer.customer_name like ?;";
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
    public  List<Customer> search(String name1){
        List<Customer> customers=new ArrayList<>();
        try (Connection connection = baseRepository.getConnection();
             PreparedStatement preparedStatement=connection.prepareStatement(SEARCH_CUSTOMER_SQL)){
            preparedStatement.setString(1,"%"+name1+"%");
            System.out.println(preparedStatement);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                int id =rs.getInt("customer_id");
                String name =rs.getString("customer_name");
                String birthday=rs.getString("birthday");
                String card=rs.getString("identify_card_number");
                String phoneNumber=rs.getString("phone_number");
                int type=rs.getInt("customer_type_id");
                String email = rs.getString("email");
                String address = rs.getString("address");
                customers.add( new Customer(id, name,birthday,card,phoneNumber, email, address,type));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }


}
