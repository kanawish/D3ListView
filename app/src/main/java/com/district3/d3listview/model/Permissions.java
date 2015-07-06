
package com.district3.d3listview.model;

import com.google.gson.annotations.Expose;

public class Permissions {

    @Expose
    private Boolean admin;
    @Expose
    private Boolean push;
    @Expose
    private Boolean pull;

    /**
     * 
     * @return
     *     The admin
     */
    public Boolean getAdmin() {
        return admin;
    }

    /**
     * 
     * @param admin
     *     The admin
     */
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    /**
     * 
     * @return
     *     The push
     */
    public Boolean getPush() {
        return push;
    }

    /**
     * 
     * @param push
     *     The push
     */
    public void setPush(Boolean push) {
        this.push = push;
    }

    /**
     * 
     * @return
     *     The pull
     */
    public Boolean getPull() {
        return pull;
    }

    /**
     * 
     * @param pull
     *     The pull
     */
    public void setPull(Boolean pull) {
        this.pull = pull;
    }

}
