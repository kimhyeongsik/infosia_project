package struts.Dao;

import java.util.List;

import struts.Model.WorkingDayVO;


public class WorkTimeDAOImpl implements WorkTimeDAO {
	
	private static WorkTimeDAOImpl single;
	
	public static WorkTimeDAOImpl getInstance(){
		if(single == null){
			single = new WorkTimeDAOImpl();
		}
		return single;
	}

	@Override
	public int insertInWorkTime(int eno, String div, String regdate,
			String regtime) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertOutWorkTime(int eno, String regdate, String regtime)
			throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<WorkingDayVO> selectWorkingDayList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	

}
