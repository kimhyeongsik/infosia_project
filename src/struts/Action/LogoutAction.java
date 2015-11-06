package struts.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.Dao.WorkTimeDAO;
import struts.Dao.WorkTimeDAOImpl;
import struts.Util.DateCal;

public class LogoutAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		
		int eno = Integer.parseInt(request.getParameter("eno"));
		
		DateCal date = new DateCal();
		
		String regdate = date.getTodaydate();
		String regtime = date.getTodaytime();
		
		
		WorkTimeDAO dao = WorkTimeDAOImpl.getInstance();
		
		
		dao.insertOutWorkTime(eno, regdate, regtime);
		
		
		HttpSession session = request.getSession();
		
		session.removeAttribute("emp");
		
		
		return super.execute(mapping, form, request, response);
	}

}
