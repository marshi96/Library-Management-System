/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author User
 */
@Embeddable
public class IssuedbooksPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "bookid")
    private String bookid;
    @Basic(optional = false)
    @Column(name = "uname")
    private String uname;

    public IssuedbooksPK() {
    }

    public IssuedbooksPK(String bookid, String uname) {
        this.bookid = bookid;
        this.uname = uname;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookid != null ? bookid.hashCode() : 0);
        hash += (uname != null ? uname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IssuedbooksPK)) {
            return false;
        }
        IssuedbooksPK other = (IssuedbooksPK) object;
        if ((this.bookid == null && other.bookid != null) || (this.bookid != null && !this.bookid.equals(other.bookid))) {
            return false;
        }
        if ((this.uname == null && other.uname != null) || (this.uname != null && !this.uname.equals(other.uname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lms.IssuedbooksPK[ bookid=" + bookid + ", uname=" + uname + " ]";
    }
    
}
