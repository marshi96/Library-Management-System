/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "userdate", catalog = "lms", schema = "")
@NamedQueries({
    @NamedQuery(name = "Userdate.findAll", query = "SELECT u FROM Userdate u"),
    @NamedQuery(name = "Userdate.findByUname", query = "SELECT u FROM Userdate u WHERE u.uname = :uname"),
    @NamedQuery(name = "Userdate.findByDate", query = "SELECT u FROM Userdate u WHERE u.date = :date"),
    @NamedQuery(name = "Userdate.findByDater", query = "SELECT u FROM Userdate u WHERE u.dater = :dater"),
    @NamedQuery(name = "Userdate.findByBookid", query = "SELECT u FROM Userdate u WHERE u.bookid = :bookid")})
public class Userdate implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "uname")
    private String uname;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "dater")
    @Temporal(TemporalType.DATE)
    private Date dater;
    @Id
    @Basic(optional = false)
    @Column(name = "bookid")
    private String bookid;

    public Userdate() {
    }

    public Userdate(String bookid) {
        this.bookid = bookid;
    }

    public Userdate(String bookid, String uname, Date date) {
        this.bookid = bookid;
        this.uname = uname;
        this.date = date;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        String oldUname = this.uname;
        this.uname = uname;
        changeSupport.firePropertyChange("uname", oldUname, uname);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public Date getDater() {
        return dater;
    }

    public void setDater(Date dater) {
        Date oldDater = this.dater;
        this.dater = dater;
        changeSupport.firePropertyChange("dater", oldDater, dater);
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        String oldBookid = this.bookid;
        this.bookid = bookid;
        changeSupport.firePropertyChange("bookid", oldBookid, bookid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookid != null ? bookid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userdate)) {
            return false;
        }
        Userdate other = (Userdate) object;
        if ((this.bookid == null && other.bookid != null) || (this.bookid != null && !this.bookid.equals(other.bookid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lms.Userdate[ bookid=" + bookid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
