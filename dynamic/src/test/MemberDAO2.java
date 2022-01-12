package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO2 {
	Connection conn = DBconnection.getConnection();
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public boolean signupCheck(MemberDTO dto) {
		String sql = "INSERT INTO MEMBER VALUES (?, ?, ?, 1000)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getName());
			int ret = pstmt.executeUpdate();
			
			if(ret == 1) 			
					return true;
			
			else
				return false;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
