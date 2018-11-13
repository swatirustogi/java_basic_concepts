package practice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class JDBCConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("");
			Connection conn = DriverManager.getConnection("string","uname","pwd");
			//Statement
			Statement s = conn.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_INSENSITIVE);
			ResultSet rs = s.executeQuery("select * from students");
			while(rs.next())
				rs.getString("Name");
			
			//PreparedStatement
			PreparedStatement ps = conn.prepareStatement("select * from student where id = ?;");
			ps.setString(1, "1");
			rs  = ps.executeQuery();
			
			
			
			//callablestatement
			String sql = "call getEmpNameProc(?,?);";
			CallableStatement cst = conn.prepareCall(sql);
			cst.setInt(1, 1);
			cst.registerOutParameter(2, Types.VARCHAR);
			cst.execute();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
