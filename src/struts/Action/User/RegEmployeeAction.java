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

		/*bean폼 가져오기*/
		DynaActionForm dyform = (DynaActionForm) form;

		/*bean폼 내용*/
		String name = dyform.getString("name");
		String email = dyform.getString("email");
		String pwd = dyform.getString("pwd");	
		
		/*dao 생성*/
		dao = EmployeeDAOImpl.getInstance();

		
		int result = 0;

		/*dao전달*/
		/*0이면 false, 1이면 true*/
		result = dao.insertEmployee(name, email, pwd);

		/*0이면 다시 작성페이지로 이동*/
		if(result == 0){
			return mapping.findForward("false");
		}
		
		request.setAttribute("vo", vo);
		
		return mapping.findForward("success");
	}

}
