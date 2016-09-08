/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package epay.bisnis;

/**
 *
 * @author evan
 */
import com.ibatis.sqlmap.client.SqlMapClient;
import com.opensymphony.xwork2.ActionSupport;
import epay.orm.model.m_epay_login;
import java.net.URLDecoder;
public class showLogin extends ActionSupport{
private String maping;
private SqlMapClient sqlMap;
private m_epay_login login;
private String urlInstagramnew;
private String fburlnew;
public String execute() throws Exception { 
    sqlMap = epay.orm.app.getSqlMapInstance();
    login = (m_epay_login) sqlMap.queryForObject("tes");
    
    
    setUrlInstagramnew(getUrlInstagramnew().replace("*", "%").replace(">", "&"));
    setFburlnew(getFburlnew().replace("*", "%").replace(">", "&"));
    
    
    String ips = getClass().getResource("/ipconfig.ini").getPath();
    ips = URLDecoder.decode(ips, "UTF-8").trim();
    java.io.File file = new java.io.File(ips);
    java.io.BufferedReader in = new java.io.BufferedReader(new java.io.FileReader(file));
    setMaping(in.readLine());
    String path = getClass().getResource("/epay").getPath();
    path = path.replace("/WEB-INF/classes/epay/", "");
    path = path.replace("/build/web/", "");
    path = path.replace("/build/web", "");
    path = path.substring(path.lastIndexOf("/"));
    path = path + "/pages/";
    maping = maping + path;
    in.close();
    
    
    return SUCCESS;
}

    public String getMaping() {
        return maping;
    }

    public void setMaping(String maping) {
        this.maping = maping;
    }

    public SqlMapClient getSqlMap() {
        return sqlMap;
    }

    public void setSqlMap(SqlMapClient sqlMap) {
        this.sqlMap = sqlMap;
    }

    public m_epay_login getLogin() {
        return login;
    }

    public void setLogin(m_epay_login login) {
        this.login = login;
    }

//    /**
//     * @return the response
//     */
//    public HttpServletResponse getResponse() {
//        return response;
//    }
//
//    /**
//     * @param response the response to set
//     */
//    public void setResponse(HttpServletResponse response) {
//        this.response = response;
//    }
//
//    /**
//     * @return the request
//     */
//    public HttpServletRequest getRequest() {
//        return request;
//    }
//
//    /**
//     * @param request the request to set
//     */
//    public void setRequest(HttpServletRequest request) {
//        this.request = request;
//    }


    /**
     * @return the urlInstagramnew
     */
    public String getUrlInstagramnew() {
        return urlInstagramnew;
    }

    /**
     * @param urlInstagramnew the urlInstagramnew to set
     */
    public void setUrlInstagramnew(String urlInstagramnew) {
        this.urlInstagramnew = urlInstagramnew;
    }

    /**
     * @return the fburlnew
     */
    public String getFburlnew() {
        return fburlnew;
    }

    /**
     * @param fburlnew the fburlnew to set
     */
    public void setFburlnew(String fburlnew) {
        this.fburlnew = fburlnew;
    }
    
}
