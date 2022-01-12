package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberDAO {
	Connection conn = DBconnection.getConnection();
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public boolean loginCheck(MemberDTO dto) {
		String sql = "SELECT COUNT(*) FROM MEMBER WHERE ID = ? AND PW = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int ret = rs.getInt(1);
				if(ret == 1) {
					return true;
				}
				else
					return false;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}




	
}

