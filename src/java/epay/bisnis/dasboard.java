/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package epay.bisnis;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.List;
import epay.orm.*;
/**
 *
 * @author evan
 */
public class dasboard extends ActionSupport{
    public String email;
    private List menus,moduls;
    private SqlMapClient sqlMap;
 
public String execute() throws Exception{
       sqlMap = app.getSqlMapInstance();
       try {
            menus = sqlMap.queryForList("getMenu");
            moduls = sqlMap.queryForList("getModul");
         } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
         return SUCCESS;
}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List getMenus() {
        return menus;
    }

    public void setMenus(List menus) {
        this.menus = menus;
    }

    public List getModuls() {
        return moduls;
    }

    public void setModuls(List moduls) {
        this.moduls = moduls;
    }

    public SqlMapClient getSqlMap() {
        return sqlMap;
    }

    public void setSqlMap(SqlMapClient sqlMap) {
        this.sqlMap = sqlMap;
    }
}
