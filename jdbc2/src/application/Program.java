package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = null; // Preparar o banco
		Statement st = null; // Consulta ao SQL
		ResultSet rs = null; // Guardar o resultado da consulta
		
		try{
			conn = DB.getConnection();
			
			st = conn.createStatement(); // instaciação do objeto do tipo Statement
			
			rs = st.executeQuery("select * from department"); // espera o comando SQL
					
			//  rs inicial na posição 0, para percorrermos os dados:
			while (rs.next()) {	// next() na última linha retorna false
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
	}

}
