package com.thinking.machines.hr.dl;
import java.util.*;
import java.sql.*;
public class AdministratorDAO
{
public AdministratorDTO getByUsername(String username) throws DAOException
{
try
{
Connection connection=DAOConnection.getConnection();
PreparedStatement preparedStatement;
preparedStatement=connection.prepareStatement("select * from administrator where uname=?");
preparedStatement.setString(1,username);
ResultSet resultSet;
resultSet=preparedStatement.executeQuery();
if(resultSet.next()==false)
{
resultSet.close();
preparedStatement.close();
connection.close();
throw new DAOException("Invalid administrator username : "+username);
}
AdministratorDTO administratorDTO=new AdministratorDTO();
administratorDTO.setUsername(username);
administratorDTO.setPassword(resultSet.getString("pwd").trim());
resultSet.close();
connection.close();
preparedStatement.close();
return administratorDTO;
}catch(Exception exception)
{
throw new DAOException(exception.getMessage());
}
}
}