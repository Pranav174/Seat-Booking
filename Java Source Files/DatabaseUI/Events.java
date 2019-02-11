/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseUI;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author pranav goyal
 */
@Entity
@Table(name = "EVENTS", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Events.findAll", query = "SELECT e FROM Events e")
    , @NamedQuery(name = "Events.findByEventid", query = "SELECT e FROM Events e WHERE e.eventid = :eventid")
    , @NamedQuery(name = "Events.findByEventName", query = "SELECT e FROM Events e WHERE e.eventName = :eventName")
    , @NamedQuery(name = "Events.findByEventDate", query = "SELECT e FROM Events e WHERE e.eventDate = :eventDate")
    , @NamedQuery(name = "Events.findByStartingtime", query = "SELECT e FROM Events e WHERE e.startingtime = :startingtime")
    , @NamedQuery(name = "Events.findByEndingtime", query = "SELECT e FROM Events e WHERE e.endingtime = :endingtime")
    , @NamedQuery(name = "Events.findByDescription", query = "SELECT e FROM Events e WHERE e.description = :description")
    , @NamedQuery(name = "Events.findByReservedSeats", query = "SELECT e FROM Events e WHERE e.reservedSeats = :reservedSeats")
    , @NamedQuery(name = "Events.findByBookingStart", query = "SELECT e FROM Events e WHERE e.bookingStart = :bookingStart")
    , @NamedQuery(name = "Events.findByBookingEnd", query = "SELECT e FROM Events e WHERE e.bookingEnd = :bookingEnd")
    , @NamedQuery(name = "Events.findByPyp", query = "SELECT e FROM Events e WHERE e.pyp = :pyp")
    , @NamedQuery(name = "Events.findByMyp", query = "SELECT e FROM Events e WHERE e.myp = :myp")
    , @NamedQuery(name = "Events.findBySenior", query = "SELECT e FROM Events e WHERE e.senior = :senior")
    , @NamedQuery(name = "Events.findByTeachers", query = "SELECT e FROM Events e WHERE e.teachers = :teachers")
    , @NamedQuery(name = "Events.findByParents", query = "SELECT e FROM Events e WHERE e.parents = :parents")
    , @NamedQuery(name = "Events.findByExternalorg", query = "SELECT e FROM Events e WHERE e.externalorg = :externalorg")})
public class Events implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EVENTID", nullable = false)
    private Integer eventid;
    @Basic(optional = false)
    @Column(name = "EVENT_NAME", nullable = false, length = 30)
    private String eventName;
    @Column(name = "EVENT_DATE")
    @Temporal(TemporalType.DATE)
    private Date eventDate;
    @Column(name = "STARTINGTIME")
    @Temporal(TemporalType.TIME)
    private Date startingtime;
    @Column(name = "ENDINGTIME")
    @Temporal(TemporalType.TIME)
    private Date endingtime;
    @Column(name = "DESCRIPTION", length = 300)
    private String description;
    @Column(name = "RESERVED_SEATS", length = 300)
    private String reservedSeats;
    @Column(name = "BOOKING_START")
    @Temporal(TemporalType.DATE)
    private Date bookingStart;
    @Column(name = "BOOKING_END")
    @Temporal(TemporalType.DATE)
    private Date bookingEnd;
    @Column(name = "PYP")
    private Boolean pyp;
    @Column(name = "MYP")
    private Boolean myp;
    @Column(name = "SENIOR")
    private Boolean senior;
    @Column(name = "TEACHERS")
    private Boolean teachers;
    @Column(name = "PARENTS")
    private Boolean parents;
    @Column(name = "EXTERNALORG")
    private Boolean externalorg;

    public Events() {
    }

    public Events(Integer eventid) {
        this.eventid = eventid;
    }

    public Events(Integer eventid, String eventName) {
        this.eventid = eventid;
        this.eventName = eventName;
    }

    public Integer getEventid() {
        return eventid;
    }

    public void setEventid(Integer eventid) {
        Integer oldEventid = this.eventid;
        this.eventid = eventid;
        changeSupport.firePropertyChange("eventid", oldEventid, eventid);
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        String oldEventName = this.eventName;
        this.eventName = eventName;
        changeSupport.firePropertyChange("eventName", oldEventName, eventName);
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        Date oldEventDate = this.eventDate;
        this.eventDate = eventDate;
        changeSupport.firePropertyChange("eventDate", oldEventDate, eventDate);
    }

    public Date getStartingtime() {
        return startingtime;
    }

    public void setStartingtime(Date startingtime) {
        Date oldStartingtime = this.startingtime;
        this.startingtime = startingtime;
        changeSupport.firePropertyChange("startingtime", oldStartingtime, startingtime);
    }

    public Date getEndingtime() {
        return endingtime;
    }

    public void setEndingtime(Date endingtime) {
        Date oldEndingtime = this.endingtime;
        this.endingtime = endingtime;
        changeSupport.firePropertyChange("endingtime", oldEndingtime, endingtime);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        String oldDescription = this.description;
        this.description = description;
        changeSupport.firePropertyChange("description", oldDescription, description);
    }

    public String getReservedSeats() {
        return reservedSeats;
    }

    public void setReservedSeats(String reservedSeats) {
        String oldReservedSeats = this.reservedSeats;
        this.reservedSeats = reservedSeats;
        changeSupport.firePropertyChange("reservedSeats", oldReservedSeats, reservedSeats);
    }

    public Date getBookingStart() {
        return bookingStart;
    }

    public void setBookingStart(Date bookingStart) {
        Date oldBookingStart = this.bookingStart;
        this.bookingStart = bookingStart;
        changeSupport.firePropertyChange("bookingStart", oldBookingStart, bookingStart);
    }

    public Date getBookingEnd() {
        return bookingEnd;
    }

    public void setBookingEnd(Date bookingEnd) {
        Date oldBookingEnd = this.bookingEnd;
        this.bookingEnd = bookingEnd;
        changeSupport.firePropertyChange("bookingEnd", oldBookingEnd, bookingEnd);
    }

    public Boolean getPyp() {
        return pyp;
    }

    public void setPyp(Boolean pyp) {
        Boolean oldPyp = this.pyp;
        this.pyp = pyp;
        changeSupport.firePropertyChange("pyp", oldPyp, pyp);
    }

    public Boolean getMyp() {
        return myp;
    }

    public void setMyp(Boolean myp) {
        Boolean oldMyp = this.myp;
        this.myp = myp;
        changeSupport.firePropertyChange("myp", oldMyp, myp);
    }

    public Boolean getSenior() {
        return senior;
    }

    public void setSenior(Boolean senior) {
        Boolean oldSenior = this.senior;
        this.senior = senior;
        changeSupport.firePropertyChange("senior", oldSenior, senior);
    }

    public Boolean getTeachers() {
        return teachers;
    }

    public void setTeachers(Boolean teachers) {
        Boolean oldTeachers = this.teachers;
        this.teachers = teachers;
        changeSupport.firePropertyChange("teachers", oldTeachers, teachers);
    }

    public Boolean getParents() {
        return parents;
    }

    public void setParents(Boolean parents) {
        Boolean oldParents = this.parents;
        this.parents = parents;
        changeSupport.firePropertyChange("parents", oldParents, parents);
    }

    public Boolean getExternalorg() {
        return externalorg;
    }

    public void setExternalorg(Boolean externalorg) {
        Boolean oldExternalorg = this.externalorg;
        this.externalorg = externalorg;
        changeSupport.firePropertyChange("externalorg", oldExternalorg, externalorg);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventid != null ? eventid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Events)) {
            return false;
        }
        Events other = (Events) object;
        if ((this.eventid == null && other.eventid != null) || (this.eventid != null && !this.eventid.equals(other.eventid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DatabaseUI.Events[ eventid=" + eventid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
