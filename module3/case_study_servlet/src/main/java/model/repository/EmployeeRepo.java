package model.repository;

import model.bean.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo {
    private  static final  String SELECT_ALL_Eployee="select * from employee;" ;

    private  static  final  String INSERT_EMPLOYEE="insert into employee(employee_name,degree_id,department_id,position_id,birthday,identify_card_number,phone_number,email,address)\n" +
            "values(?,?,?,?,?,?,?,?,?);";
    private static final String SELECT_DEGREE="select* from degree \n" +
            "where degree_id=?;";
    private static final String SELECT_DEPARTMENT="select* from department \n" +
            "where department_id=?;\n";
    private static final String SELECT_POSITION="select* from position_employee \n" +
            "where position_id=?;";

    private static final String DELETE="delete from employee e\n" +
            "where e.employee_id=?;";
    private  static  final String SELECT_EMPLOYEE="select * from employee where employee_id=?;";

    private static final String UPDATE="update employee e\n" +
            "set e.employee_name=?,e.degree_id=?,department_id=?,position_id=?,birthday=?,identify_card_number=?,phone_number=?,email=?,address=?\n" +
            "where e.employee_id=?;";
    private static final String SEARCH_EMPLOYEE_SQL="select *\n" +
            "from employee\n" +
            "where employee.employee_name like ?;";
    BaseRepository baseRepository=new BaseRepository();

    public List<Employee> search(String name1){
        List<Employee> employees=new ArrayList<>();
        try (Connection connection = baseRepository.getConnection();
             PreparedStatement preparedStatement=connection.prepareStatement(SEARCH_EMPLOYEE_SQL)){
            preparedStatement.setString(1,"%"+name1+"%");
            System.out.println(preparedStatement);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                int id=rs.getInt("employee_id");
                String name = rs.getString("employee_name");
                String birthday=rs.getString("birthday");
                String card=rs.getString("identify_card_number");
                String phoneNumber=rs.getString("phone_number");
                String email = rs.getString("Email");
                String address = rs.getString("address");
                Degree degree=selectDegree(rs.getInt("degree_id"));
                Department department=selectDepartment(rs.getInt("department_id"));
                Position position=selectPosition(rs.getInt("position_id"));

                employees.add(new Employee(id,name,degree,department,position,birthday,card,phoneNumber,email,address));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;

    }

    public void  update(Employee employee){
        try {
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(UPDATE);
            statement.setString(1,employee.getName());
            statement.setInt(2,employee.getDegree().getId());
            statement.setInt(3,employee.getDepartment().getId());
            statement.setInt(4,employee.getPosition().getId());
            statement.setString(5,employee.getBirthday());
            statement.setString(6,employee.getCard());
            statement.setString(7,employee.getPhoneNumber());
            statement.setString(8,employee.getEmail());
            statement.setString(9,employee.getAddress());
            statement.setInt(10,employee.getId());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Employee select(int id){
        Employee employee=null;
        try{
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(SELECT_EMPLOYEE);
            statement.setInt(1,id);
            System.out.println(statement);
            // Step 3: Execute the query or update query
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                String name = rs.getString("employee_name");
                String birthday=rs.getString("birthday");
                String card=rs.getString("identify_card_number");
                String phoneNumber=rs.getString("phone_number");
                String email = rs.getString("Email");
                String address = rs.getString("address");
                Degree degree=selectDegree(rs.getInt("degree_id"));
                Department department=selectDepartment(rs.getInt("department_id"));
                Position position=selectPosition(rs.getInt("position_id"));

                employee=new Employee(id,name,degree,department,position,birthday,card,phoneNumber,email,address);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
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

    public  void insert(Employee employee){
        try{
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(INSERT_EMPLOYEE);
            statement.setString(1,employee.getName());
            statement.setInt(2,employee.getDegree().getId());
            statement.setInt(3,employee.getDepartment().getId());
            statement.setInt(4,employee.getPosition().getId());
            statement.setString(5,employee.getBirthday());
            statement.setString(6,employee.getCard());
            statement.setString(7,employee.getPhoneNumber());
            statement.setString(8,employee.getEmail());
            statement.setString(9,employee.getAddress());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Degree selectDegree(int id){
        Degree degree = null;

        try (Connection connection = baseRepository.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DEGREE);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("degree");
                degree= new Degree(id, name);
            }
        } catch (SQLException e) {
            e.getErrorCode();
        }
        return degree;
    }
    public Department selectDepartment(int id){
        Department department = null;

        try (Connection connection = baseRepository.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DEPARTMENT);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("department");
                department= new Department(id, name);
            }
        } catch (SQLException e) {
            e.getErrorCode();
        }
        return department;
    }
    public Position selectPosition(int id){
        Position position = null;

        try (Connection connection = baseRepository.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_POSITION);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("position_name");
                position= new Position(id, name);
            }
        } catch (SQLException e) {
            e.getErrorCode();
        }
        return position;
    }


    public List<Employee> selectAll() {
        List<Employee> list = new ArrayList<>();
        try (Connection connection = baseRepository.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_Eployee)) {
            System.out.println(preparedStatement);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("employee_id");
                String name = rs.getString("employee_name");
                String birthday=rs.getString("birthday");
                String card=rs.getString("identify_card_number");
                String phoneNumber=rs.getString("phone_number");
                String email = rs.getString("Email");
                String address = rs.getString("address");
                Degree degree=selectDegree(rs.getInt("degree_id"));
                Department department=selectDepartment(rs.getInt("department_id"));
                Position position=selectPosition(rs.getInt("position_id"));

                list.add(new Employee(id,name,degree,department,position,birthday,card,phoneNumber,email,address));
            }
        } catch (SQLException e) {
            e.getErrorCode();
        }
        return list;
    }
}
