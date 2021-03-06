package net.viralpatel.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private String username;
    private String password;
    private static String SUCCESS="success";
    private static String FAILURE="failure";
 
    public String execute() {
 
        if (this.username.equals("admin")
                && this.password.equals("admin123")) {
            return SUCCESS;
        } else {
            addActionError(getText("error.login")); 
            return FAILURE; 
        }
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
}

