/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package epay.bisnis.loginFacebook;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.List;
import java.io.IOException;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author evan
 */
public class logFb extends ActionSupport {
 
	private static final long serialVersionUID = 1L;
	private String code;
        private HttpServletResponse response;
        private HttpServletRequest request;

public String execute() throws Exception , ServletException, IOException{
                setCode(request.getParameter("code"));
		if (getCode() == null || getCode().equals("")) {
			throw new RuntimeException("ERROR: Didn't get code parameter in callback.");
		}
		FBConnection fbConnection = new FBConnection();
		String accessToken = fbConnection.getAccessToken(getCode());
		FBGraph fbGraph = new FBGraph(accessToken);
		String graph = fbGraph.getFBGraph();
		Map<String, String> fbProfileData = fbGraph.getGraphData(graph);
                fbConnection.getFBAuthUrl();
      return SUCCESS;
}

     public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

}


