package struts.Dao;

import struts.Model.EmployeeVO;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private static EmployeeDAO single;
	
	public static EmployeeDAO getInstance(){
		if(single == null){
			single = new EmployeeDAOImpl();
		}
		return single;
	}

	@Override
	public int insertEmployee(EmployeeVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EmployeeVO selectEmployee(String email, String pwd, int grade) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
