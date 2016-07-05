/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ahmad
 */
@Entity
@Table(name = "value")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Value.findAll", query = "SELECT v FROM Value v"),
    @NamedQuery(name = "Value.findById", query = "SELECT v FROM Value v WHERE v.id = :id"),
    @NamedQuery(name = "Value.findByValue", query = "SELECT v FROM Value v WHERE v.value = :value"),
    @NamedQuery(name = "Value.findByThreshold1", query = "SELECT v FROM Value v WHERE v.threshold1 = :threshold1"),
    @NamedQuery(name = "Value.findByThreshold2", query = "SELECT v FROM Value v WHERE v.threshold2 = :threshold2")})
public class Value implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Size(max = 45)
    @Column(name = "value", length = 45)
    private String value;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "threshold1", precision = 22)
    private Double threshold1;
    @Column(name = "threshold2", precision = 22)
    private Double threshold2;
    @JoinColumn(name = "measure_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private Measure measureID;
    @JoinColumn(name = "house_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private House houseID;

    public Value() {
    }

    public Value(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Double getThreshold1() {
        return threshold1;
    }

    public void setThreshold1(Double threshold1) {
        this.threshold1 = threshold1;
    }

    public Double getThreshold2() {
        return threshold2;
    }

    public void setThreshold2(Double threshold2) {
        this.threshold2 = threshold2;
    }

    public Measure getMeasureID() {
        return measureID;
    }

    public void setMeasureID(Measure measureID) {
        this.measureID = measureID;
    }

    public House getHouseID() {
        return houseID;
    }

    public void setHouseID(House houseID) {
        this.houseID = houseID;
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
        if (!(object instanceof Value)) {
            return false;
        }
        Value other = (Value) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Value[ id=" + id + " ]";
    }
    
}
