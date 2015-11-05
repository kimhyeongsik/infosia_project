package struts.Processor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.RequestProcessor;

public class EncodingProcessor extends RequestProcessor {
	
	@Override
	protected boolean processRoles(HttpServletRequest req,
			HttpServletResponse res, ActionMapping actm) throws IOException,
			ServletException {
		// TODO Auto-generated method stub
		
		req.setCharacterEncoding("UTF-8");
		
		return true;
	}

}
