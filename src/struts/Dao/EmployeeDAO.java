package struts.Dao;

import java.util.List;

import struts.Model.EmployeeVO;

public interface EmployeeDAO {
	
	public int insertEmployee() throws Exception;
	public EmployeeVO selectEmployee() throws Exception;
	public int updateEmployee() throws Exception;
	public List<EmployeeVO> selectEmployeeList() throws Exception;
	

}
