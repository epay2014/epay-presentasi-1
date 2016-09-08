/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package epay.orm;

/**
 *
 * @author evan
 */
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import java.io.Reader;
public class app {
    public static final SqlMapClient sqlmap;
    static {
        try{
            String resource = "epay/orm/sqlmap.xml";
            Reader reader = Resources.getResourceAsReader(resource);
            sqlmap = SqlMapClientBuilder.buildSqlMapClient(reader);
        }catch(Exception e){
          throw new RuntimeException("Error initializing AppSQLMap class. Cause: "+e);
        }
    }
      public static SqlMapClient getSqlMapInstance() {
        return sqlmap;
    }
    
}
