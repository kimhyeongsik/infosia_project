package struts.Action.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

import struts.Dao.EmployeeDAO;
import struts.Dao.EmployeeDAOImpl;
import struts.Model.EmployeeVO;

public class RegEmployeeAction extends Action {

	private EmployeeDAO dao;
	private EmployeeVO vo;

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		// TODO Auto-generated method stub

		/*bean�� ��������*/
		DynaActionForm dyform = (DynaActionForm) form;

		/*bean�� ����*/
		String name = dyform.getString("name");
		String email = dyform.getString("email");
		String pwd = dyform.getString("pwd");	
		
		/*dao ����*/
		dao = EmployeeDAOImpl.getInstance();

		
		int result = 0;

		/*dao����*/
		/*0�̸� false, 1�̸� true*/
		result = dao.insertEmployee(name, email, pwd);

		/*0�̸� �ٽ� �ۼ��������� �̵�*/
		if(result == 0){
			return mapping.findForward("false");
		}
		
		request.setAttribute("vo", vo);
		
		return mapping.findForward("success");
	}

}
