/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "acount")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Acount.findAll", query = "SELECT a FROM Acount a"),
    @NamedQuery(name = "Acount.findById", query = "SELECT a FROM Acount a WHERE a.id = :id"),
    @NamedQuery(name = "Acount.findByNameperson", query = "SELECT a FROM Acount a WHERE a.nameperson = :nameperson"),
    @NamedQuery(name = "Acount.findByPhone", query = "SELECT a FROM Acount a WHERE a.phone = :phone"),
    @NamedQuery(name = "Acount.findByGmail", query = "SELECT a FROM Acount a WHERE a.gmail = :gmail"),
    @NamedQuery(name = "Acount.findByUserName", query = "SELECT a FROM Acount a WHERE a.userName = :userName"),
    @NamedQuery(name = "Acount.findByPassWord", query = "SELECT a FROM Acount a WHERE a.passWord = :passWord")})
public class Acount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Name_person")
    private String nameperson;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Phone")
    private String phone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Gmail")
    private String gmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "UserName")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PassWord")
    private String passWord;
    @OneToMany(mappedBy = "acountCreated")
    private Set<Earnings> earningsSet;
    @JoinColumn(name = "Gender_Id", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Gender genderId;
    @JoinColumn(name = "UserRoleId", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private UserRole userRoleId;
    @OneToMany(mappedBy = "userid")
    private Set<Expenditures> expendituresSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "acountId")
    @JsonIgnore
    private Set<JoinGr> joinGrSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    @JsonIgnore
    private Set<Roomgr> roomgrSet;

    public Acount() {
    }

    public Acount(Integer id) {
        this.id = id;
    }

    public Acount(Integer id, String nameperson, String phone, String gmail, String userName, String passWord) {
        this.id = id;
        this.nameperson = nameperson;
        this.phone = phone;
        this.gmail = gmail;
        this.userName = userName;
        this.passWord = passWord;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameperson() {
        return nameperson;
    }

    public void setNameperson(String nameperson) {
        this.nameperson = nameperson;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @XmlTransient
    public Set<Earnings> getEarningsSet() {
        return earningsSet;
    }

    public void setEarningsSet(Set<Earnings> earningsSet) {
        this.earningsSet = earningsSet;
    }

    public Gender getGenderId() {
        return genderId;
    }

    public void setGenderId(Gender genderId) {
        this.genderId = genderId;
    }

    public UserRole getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(UserRole userRoleId) {
        this.userRoleId = userRoleId;
    }

    @XmlTransient
    public Set<Expenditures> getExpendituresSet() {
        return expendituresSet;
    }

    public void setExpendituresSet(Set<Expenditures> expendituresSet) {
        this.expendituresSet = expendituresSet;
    }

    @XmlTransient
    public Set<JoinGr> getJoinGrSet() {
        return joinGrSet;
    }

    public void setJoinGrSet(Set<JoinGr> joinGrSet) {
        this.joinGrSet = joinGrSet;
    }

    @XmlTransient
    public Set<Roomgr> getRoomgrSet() {
        return roomgrSet;
    }

    public void setRoomgrSet(Set<Roomgr> roomgrSet) {
        this.roomgrSet = roomgrSet;
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
        if (!(object instanceof Acount)) {
            return false;
        }
        Acount other = (Acount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.pojo.Acount[ id=" + id + " ]";
    }
    
}
