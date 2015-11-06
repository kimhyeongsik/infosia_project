package struts.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import struts.DataBase.DBConnection;
import struts.Model.WorkingDayVO;


public class WorkTimeDAOImpl implements WorkTimeDAO {

	private static WorkTimeDAOImpl single;

	public static WorkTimeDAOImpl getInstance(){
		if(single == null){
			single = new WorkTimeDAOImpl();
		}
		return single;
	}

	/*��ٽð����*/
	@Override
	public int insertInWorkTime(int eno, String regdate,
			String regtime) {

		String sql = "insert into worktime values(?,'���',?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;
		int result = 0;

		try{
			conn = DBConnection.getInstance().getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, eno);
			pstm.setString(2, regdate);
			pstm.setString(3, regtime);

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

	/*��ٽð����*/
	@Override
	public int insertOutWorkTime(int eno, String regdate, String regtime) {

		String sql = "insert into worktime values(?,'���',?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;
		int result = 0;

		try{
			conn = DBConnection.getInstance().getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, eno);
			pstm.setString(2, regdate);
			pstm.setString(3, regtime);

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

	/*�������ٸ���Ʈ*/
	@Override
	public List<WorkingDayVO> selectWorkingDayList(int eno, String startday, String endday) {


		String sql = "select * from (select * from worktime_view where eno=?)"+
				"where to_char(add_months(regdate,0), 'yyyy/mm/dd')"
				+ "between ? and ? order by regdate";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<WorkingDayVO> list = null;

		try{
			conn = DBConnection.getInstance().getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, eno);
			pstm.setString(2, startday);
			pstm.setString(3, endday);

			rs = pstm.executeQuery();

			list = new ArrayList<WorkingDayVO>();
			while(rs.next()){
				WorkingDayVO vo = new WorkingDayVO();



				list.add(vo);
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

		return list;
	}






}
