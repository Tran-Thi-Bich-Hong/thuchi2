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
@Table(name = "expenditures")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Expenditures.findAll", query = "SELECT e FROM Expenditures e"),
    @NamedQuery(name = "Expenditures.findById", query = "SELECT e FROM Expenditures e WHERE e.id = :id"),
    @NamedQuery(name = "Expenditures.findByCreatedDate", query = "SELECT e FROM Expenditures e WHERE e.createdDate = :createdDate"),
    @NamedQuery(name = "Expenditures.findByTotalMoney", query = "SELECT e FROM Expenditures e WHERE e.totalMoney = :totalMoney"),
    @NamedQuery(name = "Expenditures.findByNote", query = "SELECT e FROM Expenditures e WHERE e.note = :note")})
public class Expenditures implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Created_Date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Total_Money")
    private long totalMoney;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "note")
    private String note;
    @OneToMany(mappedBy = "expendituresIdeaId")
    @JsonIgnore
    private Set<RoomIdea> roomIdeaSet;
    @JoinColumn(name = "User_id", referencedColumnName = "Id")
    @ManyToOne
    private Acount userid;
    @JoinColumn(name = "type_expenditure_id", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private TypeExpenditures typeExpenditureId;

    public Expenditures() {
    }

    public Expenditures(Integer id) {
        this.id = id;
    }

    public Expenditures(Integer id, long totalMoney, String note) {
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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

    public Acount getUserid() {
        return userid;
    }

    public void setUserid(Acount userid) {
        this.userid = userid;
    }

    public TypeExpenditures getTypeExpenditureId() {
        return typeExpenditureId;
    }

    public void setTypeExpenditureId(TypeExpenditures typeExpenditureId) {
        this.typeExpenditureId = typeExpenditureId;
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
        if (!(object instanceof Expenditures)) {
            return false;
        }
        Expenditures other = (Expenditures) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.pojo.Expenditures[ id=" + id + " ]";
    }
    
}
