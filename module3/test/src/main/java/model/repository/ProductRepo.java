package model.repository;

import model.bean.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private final static String SELECT_ALL_Eployee="select * from product;";
    private final static String INSERT_PRODUCT="insert into product(`name`,price,color,`describe`)\n" +
            "values(?,?,?,?);";
    private static final String SELECT_PRODUCT="select * from product where id=?;";
    private static final String UPDATE="update  product \n" +
            "set `name`=?,price=?,color=?,`describe`=?\n" +
            "where id=?;";
    private static final String DELETE="delete from product\n" +
            "where id=?;";
    private  static final String SEARCH_EMPLOYEE_SQL="select * from product where name like ?;";
    BaseRepository baseRepository=new BaseRepository();

    public List<Product> search(String name1){
        List<Product> products=new ArrayList<>();
        try (Connection connection = baseRepository.getConnection();
             PreparedStatement preparedStatement=connection.prepareStatement(SEARCH_EMPLOYEE_SQL)){
            preparedStatement.setString(1,"%"+name1+"%");
            System.out.println(preparedStatement);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                int id=rs.getInt("id");
                String name = rs.getString("name");
                int price=rs.getInt("price");
                String color=rs.getString("color");
                String describe=rs.getString("describe");

                products.add( new Product(id,name,price,color,describe));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

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

    public void  update(Product product){
        try {
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(UPDATE);
            statement.setString(1,product.getName());
            statement.setInt(2,product.getPrice());
            statement.setString(3,product.getColor());
            statement.setString(4,product.getDescribe());
            statement.setInt(5,product.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Product select(int id){
        Product product=null;
        try{
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(SELECT_PRODUCT);
            statement.setInt(1,id);
            System.out.println(statement);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                String name = rs.getString("name");
                int price=rs.getInt("price");
                String color=rs.getString("color");
                String describe=rs.getString("describe");
                product=new Product(id,name,price,color,describe);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    public  void insert(Product product){
        try{
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(INSERT_PRODUCT);
            statement.setString(1,product.getName());
            statement.setInt(2,product.getPrice());
            statement.setString(3,product.getColor());
            statement.setString(4,product.getDescribe());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Product> selectAll() {
        List<Product> list = new ArrayList<>();
        try (Connection connection = baseRepository.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_Eployee)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int price=rs.getInt("price");
                String color=rs.getString("color");
                String describe=rs.getString("describe");

                list.add(new Product(id,name,price,color,describe));
            }
        } catch (SQLException e) {
            e.getErrorCode();
        }
        return list;
    }
}
