package com.laboratorio2p3.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
private Connection coonec;
    
    public Conexion()
    {
    try{
    	Class.forName("com.mysql.jdbc.Driver");
        coonec = DriverManager.getConnection("jdbc:mysql://localhost/agenciac","root","root");
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
