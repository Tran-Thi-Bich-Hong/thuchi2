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
@Table(name = "type_expenditures")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypeExpenditures.findAll", query = "SELECT t FROM TypeExpenditures t"),
    @NamedQuery(name = "TypeExpenditures.findById", query = "SELECT t FROM TypeExpenditures t WHERE t.id = :id"),
    @NamedQuery(name = "TypeExpenditures.findByName", query = "SELECT t FROM TypeExpenditures t WHERE t.name = :name")})
public class TypeExpenditures implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "typeExpenditureId")
    @JsonIgnore
    private Set<Expenditures> expendituresSet;

    public TypeExpenditures() {
    }

    public TypeExpenditures(Integer id) {
        this.id = id;
    }

    public TypeExpenditures(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public Set<Expenditures> getExpendituresSet() {
        return expendituresSet;
    }

    public void setExpendituresSet(Set<Expenditures> expendituresSet) {
        this.expendituresSet = expendituresSet;
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
        if (!(object instanceof TypeExpenditures)) {
            return false;
        }
        TypeExpenditures other = (TypeExpenditures) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.pojo.TypeExpenditures[ id=" + id + " ]";
    }
    
}
