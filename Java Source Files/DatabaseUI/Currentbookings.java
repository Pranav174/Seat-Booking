/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseUI;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
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
@Table(name = "CURRENTBOOKINGS", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Currentbookings.findAll", query = "SELECT c FROM Currentbookings c")
    , @NamedQuery(name = "Currentbookings.findByBookingid", query = "SELECT c FROM Currentbookings c WHERE c.bookingid = :bookingid")
    , @NamedQuery(name = "Currentbookings.findByEventid", query = "SELECT c FROM Currentbookings c WHERE c.eventid = :eventid")
    , @NamedQuery(name = "Currentbookings.findBySeatNumber", query = "SELECT c FROM Currentbookings c WHERE c.seatNumber = :seatNumber")
    , @NamedQuery(name = "Currentbookings.findByCustomerid", query = "SELECT c FROM Currentbookings c WHERE c.customerid = :customerid")})
public class Currentbookings implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BOOKINGID", nullable = false)
    private Integer bookingid;
    @Basic(optional = false)
    @Column(name = "EVENTID", nullable = false)
    private int eventid;
    @Basic(optional = false)
    @Column(name = "SEAT_NUMBER", nullable = false, length = 80)
    private String seatNumber;
    @Basic(optional = false)
    @Column(name = "CUSTOMERID", nullable = false)
    private long customerid;

    public Currentbookings() {
    }

    public Currentbookings(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Currentbookings(Integer bookingid, int eventid, String seatNumber, long customerid) {
        this.bookingid = bookingid;
        this.eventid = eventid;
        this.seatNumber = seatNumber;
        this.customerid = customerid;
    }

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        Integer oldBookingid = this.bookingid;
        this.bookingid = bookingid;
        changeSupport.firePropertyChange("bookingid", oldBookingid, bookingid);
    }

    public int getEventid() {
        return eventid;
    }

    public void setEventid(int eventid) {
        int oldEventid = this.eventid;
        this.eventid = eventid;
        changeSupport.firePropertyChange("eventid", oldEventid, eventid);
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        String oldSeatNumber = this.seatNumber;
        this.seatNumber = seatNumber;
        changeSupport.firePropertyChange("seatNumber", oldSeatNumber, seatNumber);
    }

    public long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(long customerid) {
        long oldCustomerid = this.customerid;
        this.customerid = customerid;
        changeSupport.firePropertyChange("customerid", oldCustomerid, customerid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookingid != null ? bookingid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Currentbookings)) {
            return false;
        }
        Currentbookings other = (Currentbookings) object;
        if ((this.bookingid == null && other.bookingid != null) || (this.bookingid != null && !this.bookingid.equals(other.bookingid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DatabaseUI.Currentbookings[ bookingid=" + bookingid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
