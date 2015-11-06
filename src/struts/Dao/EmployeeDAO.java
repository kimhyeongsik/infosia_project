package struts.Dao;

import java.util.List;

import struts.Model.EmployeeVO;

public interface EmployeeDAO {
	
	public int insertEmployee(String name, String email, String pwd);
	public EmployeeVO selectEmployee(String email, String pwd, int grade) ;
	public int updateEmployee(int eno, String email, String name, String pwd);
	public List<EmployeeVO> selectEmployeeList();
	

}
