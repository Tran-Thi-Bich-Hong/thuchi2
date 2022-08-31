/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pojo;

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
@Table(name = "join_gr")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JoinGr.findAll", query = "SELECT j FROM JoinGr j"),
    @NamedQuery(name = "JoinGr.findByIdJoinGroup", query = "SELECT j FROM JoinGr j WHERE j.idJoinGroup = :idJoinGroup")})
public class JoinGr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdJoinGroup")
    private Integer idJoinGroup;
    @JoinColumn(name = "AcountId", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Acount acountId;
    @JoinColumn(name = "group_id", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Roomgr groupId;

    public JoinGr() {
    }

    public JoinGr(Integer idJoinGroup) {
        this.idJoinGroup = idJoinGroup;
    }

    public Integer getIdJoinGroup() {
        return idJoinGroup;
    }

    public void setIdJoinGroup(Integer idJoinGroup) {
        this.idJoinGroup = idJoinGroup;
    }

    public Acount getAcountId() {
        return acountId;
    }

    public void setAcountId(Acount acountId) {
        this.acountId = acountId;
    }

    public Roomgr getGroupId() {
        return groupId;
    }

    public void setGroupId(Roomgr groupId) {
        this.groupId = groupId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJoinGroup != null ? idJoinGroup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JoinGr)) {
            return false;
        }
        JoinGr other = (JoinGr) object;
        if ((this.idJoinGroup == null && other.idJoinGroup != null) || (this.idJoinGroup != null && !this.idJoinGroup.equals(other.idJoinGroup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.pojo.JoinGr[ idJoinGroup=" + idJoinGroup + " ]";
    }
    
}
