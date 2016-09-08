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
import org.jinstagram.auth.InstagramAuthService;
import org.jinstagram.auth.oauth.InstagramService;
import epay.bisnis.loginFacebook.FBConnection;
public class openLogin extends ActionSupport{
    private String urlInstagram;
    private FBConnection fBConnection;
    private String fburl;
    public String execute() throws Exception { 
           fBConnection = new FBConnection();
           InstagramService instagramServicee = new InstagramAuthService()
                .apiKey("3b358c5ad5ae4a609e53d1c25ede24d5")
                .apiSecret("0afaf30bcf064251b168c25d7f804443")
                .callback("http://localhost:8084/E-Pay2/pages/showMenu.action").build();
        String auntUrl = instagramServicee.getAuthorizationUrl();
        setUrlInstagram(auntUrl);
        setUrlInstagram(getUrlInstagram().replace("%", "*").replace("&", ">"));
        setFburl(fBConnection.getFBAuthUrl()); 
        setFburl(getFburl().replace("%", "*").replace("&", ">"));
    return SUCCESS;
}
    public String getUrlInstagram() {
        return urlInstagram;
    }
    public void setUrlInstagram(String urlInstagram) {
        this.urlInstagram = urlInstagram;
    }

    /**
     * @return the fBConnection
     */
    public FBConnection getfBConnection() {
        return fBConnection;
    }

    /**
     * @param fBConnection the fBConnection to set
     */
    public void setfBConnection(FBConnection fBConnection) {
        this.fBConnection = fBConnection;
    }

    public String getFburl() {
        return fburl;
    }

    public void setFburl(String fburl) {
        this.fburl = fburl;
    }
}
