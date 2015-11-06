package struts.Dao;

import java.util.List;

import struts.Model.WorkingDayVO;


public interface WorkTimeDAO {
	
	public int insertInWorkTime(int eno, String div, String regdate, String regtime) throws Exception;
	public int insertOutWorkTime(int eno, String regdate, String regtime) throws Exception;
	public List<WorkingDayVO> selectWorkingDayList() throws Exception;
	

}
