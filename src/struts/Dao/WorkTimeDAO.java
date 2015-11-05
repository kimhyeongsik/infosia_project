package struts.Dao;

import java.util.List;

import struts.Model.WorkingDayVO;


public interface WorkTimeDAO {
	
	public int insertInWorkTime() throws Exception;
	public int insertOutWorkTime() throws Exception;
	public List<WorkingDayVO> selectWorkingDayList() throws Exception;
	

}
