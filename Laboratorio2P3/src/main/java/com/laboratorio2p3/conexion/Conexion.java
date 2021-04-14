package com.laboratorio2p3.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
private Connection coonec;
    
    public Conexion()
    {
    try{
    	Class.forName("com.mysql.jdbc.Driver");
        coonec = DriverManager.getConnection("jdbc:mysql://localhost/appbanco","root","root");
        System.out.println("CONECTADO A LA BD");
        
    }catch (Exception e)
    {
        System.out.println("ERROR DE CONEXION A LA BD "+ e);
    }
    }
    public Connection RetornarConexion(){   
        return coonec;   
    }
}
