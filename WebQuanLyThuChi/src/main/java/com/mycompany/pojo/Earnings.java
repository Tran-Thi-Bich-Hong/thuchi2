/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "earnings")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Earnings.findAll", query = "SELECT e FROM Earnings e"),
    @NamedQuery(name = "Earnings.findById", query = "SELECT e FROM Earnings e WHERE e.id = :id"),
    @NamedQuery(name = "Earnings.findByCreateddate", query = "SELECT e FROM Earnings e WHERE e.createddate = :createddate"),
    @NamedQuery(name = "Earnings.findByTotalMoney", query = "SELECT e FROM Earnings e WHERE e.totalMoney = :totalMoney"),
    @NamedQuery(name = "Earnings.findByNote", query = "SELECT e FROM Earnings e WHERE e.note = :note")})
public class Earnings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Created_date")
    @Temporal(TemporalType.DATE)
    private Date createddate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Total_Money")
    private long totalMoney;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "note")
    private String note;
    @OneToMany(mappedBy = "eaningIdeaId")
    @JsonIgnore
    private Set<RoomIdea> roomIdeaSet;
    @JoinColumn(name = "AcountCreated", referencedColumnName = "Id")
    @ManyToOne
    private Acount acountCreated;
    @JoinColumn(name = "typeEarningId", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private TypeEarnings typeEarningId;

    public Earnings() {
    }

    public Earnings(Integer id) {
        this.id = id;
    }

    public Earnings(Integer id, long totalMoney, String note) {
        this.id = id;
        this.totalMoney = totalMoney;
        this.note = note;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public long getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(long totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @XmlTransient
    public Set<RoomIdea> getRoomIdeaSet() {
        return roomIdeaSet;
    }

    public void setRoomIdeaSet(Set<RoomIdea> roomIdeaSet) {
        this.roomIdeaSet = roomIdeaSet;
    }

    public Acount getAcountCreated() {
        return acountCreated;
    }

    public void setAcountCreated(Acount acountCreated) {
        this.acountCreated = acountCreated;
    }

    public TypeEarnings getTypeEarningId() {
        return typeEarningId;
    }

    public void setTypeEarningId(TypeEarnings typeEarningId) {
        this.typeEarningId = typeEarningId;
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
        if (!(object instanceof Earnings)) {
            return false;
        }
        Earnings other = (Earnings) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.pojo.Earnings[ id=" + id + " ]";
    }
    
}
