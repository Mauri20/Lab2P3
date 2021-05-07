package com.laboratorio2p3.dao;

import java.sql.*;
import java.util.ArrayList;
import com.laboratorio2p3.Conexion.*;
import com.laboratorio2p3.entidades.*;

public class ClsUsuario {
	//CONEXION A LA BASE DE DATOS 
    Conexion cn = new Conexion();
    Connection con = cn.RetornarConexion();
    
    
    //CONSULTAS A LA BASE DE DATOS 
    
    
    
    //SP_I_USUARIO--COMPLETADO!
    public void agregarUsuario(Usuario usuario){
      try {
            CallableStatement statement = con.prepareCall("call SP_I_Usuario(?,?,?,?,?)");
            
            statement.setInt("pIdusu", usuario.getIdUsuario());
            statement.setString("pUsuario", usuario.getUsuario());
            statement.setString("pPass", usuario.getPassWord());
            statement.setString("pTipo", usuario.getTipoUser());
            statement.setInt("pId", usuario.getId());  
            
    
            statement.execute();
            con.close();
            
            System.out.println("DATOS REGISTRADOS!");
        } catch (Exception e) {
        	System.out.println("ERROR AL REGISTRAR LOS DATOS");
        }         
    }
    //SP_U_USUARIO--COMPLETADO!
    public void actualizarUsuario(Usuario usuario) {
        try {
            CallableStatement statement = con.prepareCall("call SP_U_Usuario(?,?,?,?)");
            
            statement.setInt("pIdusu", usuario.getIdUsuario());  
            statement.setString("pUsuario", usuario.getUsuario());
            statement.setString("pTipo", usuario.getTipoUser());
            statement.setInt("pId", usuario.getId());  
            //System.out.println(usuario.getIdUsuario()+"-"+usuario.getUsuario()+"-"+usuario.getPass()+"-"+usuario.getTipo()+"-"+usuario.getId());
            int i =statement.executeUpdate();
            if(i==1){
            	System.out.println("USUARIO ACTUALIZADOOOOOOOO!");
            }else{
            	System.out.println("Error al Actualizar");
            }
            con.close();
        } catch (Exception e) {
        	System.out.println("ERROR AL ACTUALIZAR");
        }
    }
    public void actualizarUsuario(Usuario usuario, String passUdate) {
        try {
            CallableStatement statement = con.prepareCall("call SP_U_Usuario2(?,?,?,?,?)");
            
            statement.setInt("pIdusu", usuario.getIdUsuario());  
            statement.setString("pUsuario", usuario.getUsuario());
            statement.setString("pPass", passUdate);
            statement.setString("pTipo", usuario.getTipoUser());
            statement.setInt("pId", usuario.getId());  
            //System.out.println(usuario.getIdUsuario()+"-"+usuario.getUsuario()+"-"+usuario.getPass()+"-"+usuario.getTipo()+"-"+usuario.getId());
            int i =statement.executeUpdate();
            if(i==1){
            	System.out.println("USUARIO ACTUALIZADO");
            }else{
            	System.out.println("Error al Actualizar");
            }
            con.close();
        } catch (Exception e) {
        	System.out.println("ERROR AL ACTUALIZAR");
        }
    }
       
    //SP_D_USUARIO--COMPLETADO!
    public void eliminarUsuario(Usuario usuario) {
        
         try {
            CallableStatement statement = con.prepareCall("call SP_D_Usuario(?);");
            
            statement.setInt("pIdusu", usuario.getIdUsuario());  
          
            statement.execute();
            con.close();
            
            System.out.println("USUARIO ELIMINADO");                      
        } catch (Exception e) {
        	System.out.println("ERROR AL INTENTAR ELIMINAR LOS DATOS" + e);
        }
    }
    
    //SP_S_USUARIO--COMPLETADO!
     public ArrayList<Usuario> TraerUsuarios() {
        var listado = new ArrayList<Usuario>();
        
        try {
            CallableStatement statement = con.prepareCall("call SP_S_Usuario;");
            ResultSet us = statement.executeQuery();
            
            while (us.next()) {
                
                Usuario usua = new Usuario();
                
                usua.setIdUsuario(us.getInt("idUsuario"));
                usua.setUsuario(us.getString("Usuario"));
                usua.setPassWord(us.getString("Pass"));
                usua.setTipoUser(us.getString("Tipo"));
                usua.setId(us.getInt("idEmpleado"));
                              
                listado.add(usua);
            }
            
        } catch (Exception e) {
        	System.out.println("DATOS DE USUARIO NO CARGADOS " + e);
        }

        return listado;
    }
     
     //SP_S_INGRESAR--COMPLETADO!:para el ingreso
     public Usuario Login(Usuario user) {
        Usuario usu = new Usuario();
        try {
            CallableStatement statement = con.prepareCall("call SP_S_Ingresar(?,?,?);");
            
            statement.setString("pUsuario", user.getUsuario());
            statement.setString("pPass", user.getPassWord());
            statement.setString("pTipo", user.getTipoUser());      
            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                usu.setIdUsuario(result.getInt("idUsuario"));
                usu.setUsuario(result.getString("Usuario"));
                usu.setPassWord(result.getString("Pass"));
                usu.setTipoUser(result.getString("Tipo"));                        
            }
            
        } catch (Exception e) {
        	System.out.println("Credenciales no válidas" + e);
        }
        return usu;
    }
    
}
