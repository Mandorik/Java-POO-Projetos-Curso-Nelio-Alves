package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbException;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {

		// Como implementar transações?
		
		// setAutoCommit(false) - cada operação isolada será confirmada automaticamente se tiver true,  false é só 
		// quando confirmar mesmo que fecha a transação
		
		// commit() - confirmar transação
		
		// rollback() - desfazer o que já foi feito (se rolar uma falha pode pedir pra desfazer)
		
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false); // Assim agora depende de uma confirmação explícita do programador
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

			// Erro falso para simular erro no meio do processo, assim o rows1 acabou executado e o rows2 não
			// int x = 1;
			// if (x < 2) {
			//	throw new SQLException("Fake error");
			// }
			
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			conn.commit(); // Agora sim confirma a transação, depois de todas as operações
			
			System.out.println("rows1 = " + rows1);
			System.out.println("rows2 = " + rows2);
		}
		catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				// Esse é quando rola um erro no rollback
				throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
			} // Para retornar caso role algum erro no meio do processo
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
