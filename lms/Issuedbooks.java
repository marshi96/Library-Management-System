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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "issuedbooks", catalog = "lms", schema = "")
@NamedQueries({
    @NamedQuery(name = "Issuedbooks.findAll", query = "SELECT i FROM Issuedbooks i"),
    @NamedQuery(name = "Issuedbooks.findByBookid", query = "SELECT i FROM Issuedbooks i WHERE i.issuedbooksPK.bookid = :bookid"),
    @NamedQuery(name = "Issuedbooks.findByEdi", query = "SELECT i FROM Issuedbooks i WHERE i.edi = :edi"),
    @NamedQuery(name = "Issuedbooks.findByPages", query = "SELECT i FROM Issuedbooks i WHERE i.pages = :pages"),
    @NamedQuery(name = "Issuedbooks.findByUname", query = "SELECT i FROM Issuedbooks i WHERE i.issuedbooksPK.uname = :uname"),
    @NamedQuery(name = "Issuedbooks.findByPwd", query = "SELECT i FROM Issuedbooks i WHERE i.pwd = :pwd"),
    @NamedQuery(name = "Issuedbooks.findByDate", query = "SELECT i FROM Issuedbooks i WHERE i.date = :date")})
public class Issuedbooks implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IssuedbooksPK issuedbooksPK;
    @Basic(optional = false)
    @Lob
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Lob
    @Column(name = "pub")
    private String pub;
    @Column(name = "edi")
    private Integer edi;
    @Basic(optional = false)
    @Column(name = "pages")
    private int pages;
    @Basic(optional = false)
    @Column(name = "pwd")
    private String pwd;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    public Issuedbooks() {
    }

    public Issuedbooks(IssuedbooksPK issuedbooksPK) {
        this.issuedbooksPK = issuedbooksPK;
    }

    public Issuedbooks(IssuedbooksPK issuedbooksPK, String name, String pub, int pages, String pwd, Date date) {
        this.issuedbooksPK = issuedbooksPK;
        this.name = name;
        this.pub = pub;
        this.pages = pages;
        this.pwd = pwd;
        this.date = date;
    }

    public Issuedbooks(String bookid, String uname) {
        this.issuedbooksPK = new IssuedbooksPK(bookid, uname);
    }

    public IssuedbooksPK getIssuedbooksPK() {
        return issuedbooksPK;
    }

    public void setIssuedbooksPK(IssuedbooksPK issuedbooksPK) {
        this.issuedbooksPK = issuedbooksPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        String oldPub = this.pub;
        this.pub = pub;
        changeSupport.firePropertyChange("pub", oldPub, pub);
    }

    public Integer getEdi() {
        return edi;
    }

    public void setEdi(Integer edi) {
        Integer oldEdi = this.edi;
        this.edi = edi;
        changeSupport.firePropertyChange("edi", oldEdi, edi);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        int oldPages = this.pages;
        this.pages = pages;
        changeSupport.firePropertyChange("pages", oldPages, pages);
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        String oldPwd = this.pwd;
        this.pwd = pwd;
        changeSupport.firePropertyChange("pwd", oldPwd, pwd);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (issuedbooksPK != null ? issuedbooksPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Issuedbooks)) {
            return false;
        }
        Issuedbooks other = (Issuedbooks) object;
        if ((this.issuedbooksPK == null && other.issuedbooksPK != null) || (this.issuedbooksPK != null && !this.issuedbooksPK.equals(other.issuedbooksPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lms.Issuedbooks[ issuedbooksPK=" + issuedbooksPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
