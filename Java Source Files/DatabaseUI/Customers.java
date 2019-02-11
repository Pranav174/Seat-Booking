/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseUI;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author pranav goyal
 */
@Entity
@Table(name = "CUSTOMERS", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Customers.findAll", query = "SELECT c FROM Customers c")
    , @NamedQuery(name = "Customers.findById", query = "SELECT c FROM Customers c WHERE c.id = :id")
    , @NamedQuery(name = "Customers.findByType", query = "SELECT c FROM Customers c WHERE c.type = :type")
    , @NamedQuery(name = "Customers.findByFirstname", query = "SELECT c FROM Customers c WHERE c.firstname = :firstname")
    , @NamedQuery(name = "Customers.findByLastname", query = "SELECT c FROM Customers c WHERE c.lastname = :lastname")
    , @NamedQuery(name = "Customers.findByEmail", query = "SELECT c FROM Customers c WHERE c.email = :email")
    , @NamedQuery(name = "Customers.findByGrade", query = "SELECT c FROM Customers c WHERE c.grade = :grade")
    , @NamedQuery(name = "Customers.findByOrganizationname", query = "SELECT c FROM Customers c WHERE c.organizationname = :organizationname")
    , @NamedQuery(name = "Customers.findByPhonenumber", query = "SELECT c FROM Customers c WHERE c.phonenumber = :phonenumber")
    , @NamedQuery(name = "Customers.findBySection", query = "SELECT c FROM Customers c WHERE c.section = :section")
    , @NamedQuery(name = "Customers.findByChildfirstname", query = "SELECT c FROM Customers c WHERE c.childfirstname = :childfirstname")})
public class Customers implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "TYPE", nullable = false)
    private short type;
    @Basic(optional = false)
    @Column(name = "FIRSTNAME", nullable = false, length = 20)
    private String firstname;
    @Basic(optional = false)
    @Column(name = "LASTNAME", nullable = false, length = 20)
    private String lastname;
    @Column(name = "EMAIL", length = 30)
    private String email;
    @Column(name = "GRADE", length = 4)
    private String grade;
    @Column(name = "ORGANIZATIONNAME", length = 30)
    private String organizationname;
    @Column(name = "PHONENUMBER")
    private BigInteger phonenumber;
    @Column(name = "SECTION", length = 1)
    private String section;
    @Column(name = "CHILDFIRSTNAME", length = 15)
    private String childfirstname;

    public Customers() {
    }

    public Customers(Long id) {
        this.id = id;
    }

    public Customers(Long id, short type, String firstname, String lastname) {
        this.id = id;
        this.type = type;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        Long oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        short oldType = this.type;
        this.type = type;
        changeSupport.firePropertyChange("type", oldType, type);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        String oldFirstname = this.firstname;
        this.firstname = firstname;
        changeSupport.firePropertyChange("firstname", oldFirstname, firstname);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        String oldLastname = this.lastname;
        this.lastname = lastname;
        changeSupport.firePropertyChange("lastname", oldLastname, lastname);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        String oldGrade = this.grade;
        this.grade = grade;
        changeSupport.firePropertyChange("grade", oldGrade, grade);
    }

    public String getOrganizationname() {
        return organizationname;
    }

    public void setOrganizationname(String organizationname) {
        String oldOrganizationname = this.organizationname;
        this.organizationname = organizationname;
        changeSupport.firePropertyChange("organizationname", oldOrganizationname, organizationname);
    }

    public BigInteger getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(BigInteger phonenumber) {
        BigInteger oldPhonenumber = this.phonenumber;
        this.phonenumber = phonenumber;
        changeSupport.firePropertyChange("phonenumber", oldPhonenumber, phonenumber);
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        String oldSection = this.section;
        this.section = section;
        changeSupport.firePropertyChange("section", oldSection, section);
    }

    public String getChildfirstname() {
        return childfirstname;
    }

    public void setChildfirstname(String childfirstname) {
        String oldChildfirstname = this.childfirstname;
        this.childfirstname = childfirstname;
        changeSupport.firePropertyChange("childfirstname", oldChildfirstname, childfirstname);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customers)) {
            return false;
        }
        Customers other = (Customers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DatabaseUI.Customers[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
