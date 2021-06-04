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
    private  static final String INSERT_CUSTOMER="insert into customer(customer_type_id," +
            "customer_name,birthday,identify_card_number,phone_number,Email,address)values (?,?,?,?,?,?,?)";
    private static final String SELECT_CUSTOMER="select * from customer\n" +
            "where customer.customer_id=?";
    private static final String UPDATE_CUSTOMER="update customer c\n" +
            "set c.customer_type_id=?,c.customer_name=?,c.identify_card_number=?,c.phone_number=?, c.Email=?,c.address=?\n" +
            "where c.customer_id=?;";
    private  static  final  String DELETE ="delete from customer c\n" +
            "where c.customer_id=? ;";
    private  static final String SEARCH_CUSTOMER_SQL="select * from customer\n" +
            "where customer.customer_name like ?;";
    BaseRepository baseRepository=new BaseRepository();

    public void  delete(int id){
        try{
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(DELETE);
            statement.setInt(1,id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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

    public void update(Customer customer){
        try {
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(UPDATE_CUSTOMER);
            statement.setInt(1,customer.getCustomerTypeId());
            statement.setString(2,customer.getName());
            statement.setString(3,customer.getCard());
            statement.setString(4,customer.getPhoneNumber());
            statement.setString(5,customer.getEmail());
            statement.setString(6,customer.getAddress());
            statement.setInt(7,customer.getId());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
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
    public void insertCustomer(Customer customer){
        try{
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(INSERT_CUSTOMER);

            statement.setInt(1,customer.getCustomerTypeId());
            statement.setString(2,customer.getName());
            statement.setString(3,  customer.getBirthday());
            statement.setString(4,customer.getCard());
            statement.setString(5,customer.getPhoneNumber());
            statement.setString(6,customer.getEmail());
            statement.setString(7,customer.getAddress());
            System.out.println(statement);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public Customer selectCustomer(int id){
        Customer customer=null;
        try{
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(SELECT_CUSTOMER);
            statement.setInt(1,id);
            System.out.println(statement);
            // Step 3: Execute the query or update query
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                String name=rs.getString("customer_name");
                String birthday=rs.getString("birthday");
                String card=rs.getString("identify_card_number");
                String phoneNumber=rs.getString("phone_number");
                String email=rs.getString("Email");
                String address=rs.getString("address");
                int typeId=rs.getInt("customer_type_id");
                customer=new Customer(name,birthday,card,phoneNumber,email,address,typeId);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }


}
