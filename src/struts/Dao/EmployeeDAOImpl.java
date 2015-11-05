package struts.Dao;

import java.util.List;

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
	public int insertEmployee() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EmployeeVO selectEmployee() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeVO> selectEmployeeList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int updateEmployee() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

	
	
	

}
