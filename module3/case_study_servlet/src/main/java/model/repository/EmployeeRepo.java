package model.repository;

import model.bean.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo {
    private  static final  String SELECT_ALL_Eployee="select e.employee_id ,e.employee_name, e.birthday,e.identify_card_number,e.phone_number,\n" +
            "e.Email,e.Address,d.degree,de.department,p.position_name \n" +
            "from employee e \n" +
            "join degree d on e.degree_id=d.degree_id\n" +
            "join department de on e.department_id=de.department_id\n" +
            "join position_employee p on e.position_id=p.position_id;";
    BaseRepository baseRepository=new BaseRepository();

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
                String degree=rs.getString("degree");
                String department=rs.getString("department");
                String position=rs.getString("position_name");

                list.add(new Employee(id,name,degree,department,position,birthday,card,phoneNumber,email,address));
            }
        } catch (SQLException e) {
            e.getErrorCode();
        }
        return list;
    }
}
