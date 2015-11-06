package struts.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

import struts.Dao.EmployeeDAO;
import struts.Dao.EmployeeDAOImpl;
import struts.Dao.WorkTimeDAO;
import struts.Dao.WorkTimeDAOImpl;
import struts.Model.EmployeeVO;
import struts.Util.DateCal;

public class LoginAction extends Action {
	
	private EmployeeDAO dao;
	private EmployeeVO vo;
	
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		
		DynaActionForm dyform = (DynaActionForm) form;
		
		
		String email = dyform.getString("email");
		String pwd = dyform.getString("pwd");
		Integer grade = (Integer) dyform.get("grade");
		
		
		dao = EmployeeDAOImpl.getInstance();
		
		vo = dao.selectEmployee(email, pwd, grade);
		
		
		if(vo == null){
			
		}
		
		
		
		if(vo.getGrade() == 0){
			
			DateCal date = new DateCal();
			
			int eno = vo.getEno();
			String div = "√‚±Ÿ";
			String regdate = date.getTodaydate();
			String regtime = date.getTodaytime();
			
			WorkTimeDAO workdao = WorkTimeDAOImpl.getInstance();
			
			workdao.insertInWorkTime(eno,div,regdate, regtime);
			
			
		}
		
		
		
		
		
		
		return super.execute(mapping, form, request, response);
	}

}
