/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package epay.orm.model;

/**
 *
 * @author evan
 */
public class m_tbl_modul {
    private Integer idmodul;
    private Integer idmenu;
    private String menu_modul;

    public Integer getIdmodul() {
        return idmodul;
    }

    public void setIdmodul(Integer idmodul) {
        this.idmodul = idmodul;
    }

    public Integer getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(Integer idmenu) {
        this.idmenu = idmenu;
    }

    public String getMenu_modul() {
        return menu_modul;
    }

    public void setMenu_modul(String menu_modul) {
        this.menu_modul = menu_modul;
    }
}
