package model;

import db.DB;
import util.LngConstants;

import java.sql.*;

/**
 * Classe base para os funcionários
 */
public class Employee {

    /** Nome do funcionario. */
    private String name;

    /** Salário do funcionario. */
    private double salary;

    /** Cargo do funcionario. */
    private String office;

    /** Interface para obter um conjunto de resulatdo. */
    private ResultSet resultSet = null;

    /** Interface de declaração. */
    private Statement statement = null;

    /** Interface de declaração preparada. */
    private PreparedStatement preparedStatement = null;

    /** Pega todos os funcionários do banco de dados */
    private static final String GET_DATA = "select * from employee";

    /** Comando SQL para inserir um novo seller no banco. */
    private static final String COMMMAND_INSERT_DATA = ("INSERT INTO employee" +
            "(Name, OfficeName, Salary)" + "VALUES" + " (?, ?, ?)");

    public Employee(){}

    /**
     * Construtor.
     * @param name
     * @param salary
     * @param office
     */
    public Employee(String name,double salary, String office){
        this.name = name;
        this.salary = salary;
        this.office = office;
    }

    /**
     * Registra um funcionário no sistema.
     * @param employee
     */
    public void registerEmployee(Employee employee){
        try{
            Connection connection = DB.getConnection();
            preparedStatement = connection.prepareStatement(COMMMAND_INSERT_DATA);

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, office);
            preparedStatement.setDouble(3, salary);

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println(LngConstants.REGISTERED_EMPLOYEE +rowsAffected);
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DB.closeStatement(preparedStatement);
        }
    }

    /**
     * Mostra a lista de funcionários cadastrados no sistema.
     */
    public void showEmployeelist(){
        try{
            Connection connection = DB.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(GET_DATA);

                while (resultSet.next()) {
                    int id = resultSet.getInt("Id");
                    String name = resultSet.getString("Name");
                    String OfficeName = resultSet.getString("OfficeName");
                    double salary = resultSet.getDouble("Salary");

                    System.out.println( "Id: " + id + ", Name: " + name + ", Cargo: "
                            + OfficeName +", Salário: " + salary);
                }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DB.closeResoultSet(resultSet);
            DB.closeStatement(statement);
        }
    }

    /**
     * Seleciona cargo a ser atribuído.
     * @return
     */
    public String getOffice(int id){
        try {
            Connection connection = DB.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from office where Id =" + id);

            if(resultSet.next()){
                office = resultSet.getString("Office");
            }
            else{
                System.out.println(LngConstants.INVALID_OPTION);
                System.exit(0);
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DB.closeResoultSet(resultSet);
            DB.closeStatement(statement);
        }
        return office;
    }

    /**
     * Busca funcionário pelo id funcionário.
     * @param id
     */
    public void searchEmployee(int id){
        try {
            Connection connection = DB.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from employee where Id=" + id);

            if(resultSet.next()){
                int userId = resultSet.getInt("Id");
                String name = resultSet.getString("Name");
                String OfficeName = resultSet.getString("OfficeName");
                double salary = resultSet.getDouble("Salary");

                System.out.println( "\nId: " + userId + ", Name: " + name + ", Cargo: "
                        + OfficeName +", Salário: " + salary);
            }else{
                System.out.println(LngConstants.EMPLOYEE_NOT_EXIST);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DB.closeResoultSet(resultSet);
            DB.closeStatement(statement);
        }
    }

    /**
     * Remove funcionários do sistema.
     * @param id
     */
    public void deleteEmployee(int id){
        try{
            Connection connection = DB.getConnection();
            preparedStatement = connection.prepareStatement("delete from employee where Id=" + id);

            int rowsAffected = preparedStatement.executeUpdate();

            if(rowsAffected > 0) {
                System.out.println("\n" + LngConstants.REMOVE_EMPLOYEE + " Linhas afetadas:  " + rowsAffected);
            }else{
                System.out.println("\n" + LngConstants.EMPLOYEE_NOT_EXIST + " Linhas afetadas:  " + rowsAffected);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DB.closeStatement(preparedStatement);
        }
    }
}
