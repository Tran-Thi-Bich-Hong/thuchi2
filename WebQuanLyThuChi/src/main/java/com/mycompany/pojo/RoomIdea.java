/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "room_idea")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RoomIdea.findAll", query = "SELECT r FROM RoomIdea r"),
    @NamedQuery(name = "RoomIdea.findById", query = "SELECT r FROM RoomIdea r WHERE r.id = :id"),
    @NamedQuery(name = "RoomIdea.findByEarningStatus", query = "SELECT r FROM RoomIdea r WHERE r.earningStatus = :earningStatus"),
    @NamedQuery(name = "RoomIdea.findByExpendituresStatus", query = "SELECT r FROM RoomIdea r WHERE r.expendituresStatus = :expendituresStatus")})
public class RoomIdea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "earning_status")
    private Integer earningStatus;
    @Column(name = "expenditures_status")
    private Integer expendituresStatus;
    @JoinColumn(name = "eaning_idea_id", referencedColumnName = "Id")
    @ManyToOne
    @JsonIgnore
    private Earnings eaningIdeaId;
    @JoinColumn(name = "expenditures_idea_id", referencedColumnName = "Id")
    @ManyToOne
    private Expenditures expendituresIdeaId;
    @JoinColumn(name = "roomId", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Roomgr roomId;

    public RoomIdea() {
    }

    public RoomIdea(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEarningStatus() {
        return earningStatus;
    }

    public void setEarningStatus(Integer earningStatus) {
        this.earningStatus = earningStatus;
    }

    public Integer getExpendituresStatus() {
        return expendituresStatus;
    }

    public void setExpendituresStatus(Integer expendituresStatus) {
        this.expendituresStatus = expendituresStatus;
    }

    public Earnings getEaningIdeaId() {
        return eaningIdeaId;
    }

    public void setEaningIdeaId(Earnings eaningIdeaId) {
        this.eaningIdeaId = eaningIdeaId;
    }

    public Expenditures getExpendituresIdeaId() {
        return expendituresIdeaId;
    }

    public void setExpendituresIdeaId(Expenditures expendituresIdeaId) {
        this.expendituresIdeaId = expendituresIdeaId;
    }

    public Roomgr getRoomId() {
        return roomId;
    }

    public void setRoomId(Roomgr roomId) {
        this.roomId = roomId;
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
        if (!(object instanceof RoomIdea)) {
            return false;
        }
        RoomIdea other = (RoomIdea) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.pojo.RoomIdea[ id=" + id + " ]";
    }
    
}
