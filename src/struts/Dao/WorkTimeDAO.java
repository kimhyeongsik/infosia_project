package struts.Dao;

import java.util.List;

import struts.Model.WorkingDayVO;


public interface WorkTimeDAO {
	
	public int insertInWorkTime(int eno, String regdate, String regtime);
	public int insertOutWorkTime(int eno, String regdate, String regtime);
	public List<WorkingDayVO> selectWorkingDayList(int eno, String startday, String endday);
	

}
