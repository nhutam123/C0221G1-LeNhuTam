package model.repository;

import model.bean.*;
import model.service.CustomerService;
import model.service.EmployeeService;
import model.service.ServiceService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractRepo {
    BaseRepository baseRepository = new BaseRepository();
    EmployeeService employeeService = new EmployeeService();
    CustomerService customerService = new CustomerService();
    ServiceService serviceService = new ServiceService();
    private  static final String INSERT_CONTRACT="insert into contract(employee_id,customer_id,service_id,start_time,end_time,deposit,total_price)\n" +
            "values(?,?,?,?,?,?,?);";

    public void insertContract(Contract contract){
        try{
            Connection connection=baseRepository.getConnection();
            PreparedStatement statement=connection.prepareStatement(INSERT_CONTRACT);
            statement.setInt(1,contract.getEmployee().getId());
            statement.setInt(2,contract.getCustomer().getId());
            statement.setInt(3,contract.getService().getId());
            statement.setString(4,contract.getStartTime());
            statement.setString(5,contract.getEndTime());
            statement.setDouble(6,contract.getDeposit());
            statement.setDouble(7,contract.getTotal());
            System.out.println(statement.toString());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static final String SELECT_ALL = "select* from contract;";

    public List<Contract> selectAll() {
        List<Contract> list = new ArrayList<>();
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("contract_id");
                Employee employee = employeeService.select(rs.getInt("employee_id"));
                Customer customer = customerService.selectCustomer(rs.getInt("customer_id"));
                Service service = serviceService.selectService(rs.getInt("service_id"));
                String startTime = rs.getString("start_time");
                String endTime = rs.getString("end_time");
                double deposit = rs.getDouble("deposit");
                double totalPrice = rs.getDouble("total_price");

                list.add(new Contract(id, startTime, endTime, deposit, totalPrice, employee, customer, service));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return list;
    }
}
