package struts.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import struts.DataBase.DBConnection;
import struts.Model.EmployeeVO;

public class EmployeeDAOImpl implements EmployeeDAO{

	private static EmployeeDAO single;

	public static EmployeeDAO getInstance(){
		if(single == null){
			single = new EmployeeDAOImpl();
		}
		return single;
	}

	/*회원가입*/
	@Override
	public int insertEmployee(String name, String email, String pwd)
	{

		String sql = "insert into employee(eno,email,name,pwd) values(seq_eno.nextVal,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;
		int result = 0;
		try{
			conn = DBConnection.getInstance().getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, email);
			pstm.setString(2, name);
			pstm.setString(3, pwd);

			result = pstm.executeUpdate();

		}catch(Exception e){
			e.printStackTrace();	
		}finally{
			try{
				if(pstm != null) pstm.close();
				if(conn != null) conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}

		return result;
	}

	/*로그인*/
	@Override
	public EmployeeVO selectEmployee(String email, String pwd, int grade)
	{

		String sql = "select * from (select * from employee where grade=?)"
				+ "where email=? and pwd=?";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		EmployeeVO vo = null;

		try{
			conn = DBConnection.getInstance().getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, grade);
			pstm.setString(2, email);
			pstm.setString(3, pwd);
			rs = pstm.executeQuery();

			while(rs.next()){
				vo = new EmployeeVO();
				vo.setEno(rs.getInt("eno"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setPwd(rs.getString("pwd"));
				vo.setGrade(rs.getInt("grade"));
			}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs != null) rs.close();
				if(pstm != null) pstm.close();
				if(conn != null) conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}

		return vo;
	}

	/*회원수정*/
	@Override
	public int updateEmployee(int eno, String email, String name, String pwd) {
		// TODO Auto-generated method stub

		String sql = "update employee set"
				+ "email=?, name=?, pwd=?"
				+ "where eno=?";

		Connection conn = null;
		PreparedStatement pstm = null;
		int result = 0;

		try{
			conn = DBConnection.getInstance().getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, email);
			pstm.setString(2, name);
			pstm.setString(3, pwd);
			pstm.setInt(4, eno);

			result = pstm.executeUpdate();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstm != null) pstm.close();
				if(conn != null) conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return result;
	}

	/*관리자페이지 회원 리스트*/
	@Override
	public List<EmployeeVO> selectEmployeeList() {
		// TODO Auto-generated method stub
		return null;
	}











}
