package db;

import java.sql.*;

public class DB {

    /** Attibuto de conexão com banco de dados. **/
    private static Connection connection = null;

    /**
     * Faz a conexão com o banco de dados caso não esteja conectado.
     */
    public static Connection getConnection(){
        if(connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic",
                        "root","root");

            } catch (SQLException e){
                throw new DbException(e.getMessage());
            }
        }
        return connection;
    }

    /**
     * Encerra a conexão com o banco de dados.
     */
    public static Connection closeConnection(){
        try{
            if(connection != null){
                connection.close();
            }
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
        return connection;
    }

    /**
     * Fecha a conecão com o  Statement.
     * @param statement
     */
    public static Statement closeStatement(Statement statement){
        if(statement != null){
            try{
                statement.close();
            }catch (SQLException e){
                throw new DbException(e.getMessage());
            }
        }
        return statement;
    }

    /**
     * Fecha a conecão com o  ResoultSet.
     * @param resultSet
     */
    public static ResultSet closeResoultSet(ResultSet resultSet){
        if(resultSet != null){
            try{
                resultSet.close();
            }catch (SQLException e){
                throw new DbException(e.getMessage());
            }
        }
        return resultSet;
    }

}
