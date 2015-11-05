package struts.Dao;

import struts.Model.EmployeeVO;

public interface EmployeeDAO {
	
	public int insertEmployee(EmployeeVO vo);
	public EmployeeVO selectEmployee(String email, String pwd, int grade);

}
