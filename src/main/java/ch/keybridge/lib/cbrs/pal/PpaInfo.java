/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.keybridge.lib.cbrs.pal;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nirajan
 */
@Entity(name = "PpaInfo")
@Table(name = "PpaInfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PpaInfo.findAll", query = "SELECT p FROM PpaInfo p")
    , @NamedQuery(name = "PpaInfo.findByPalId", query = "SELECT p FROM PpaInfo p WHERE p.palId = :palId")
    , @NamedQuery(name = "PpaInfo.findByPpaDate", query = "SELECT p FROM PpaInfo p WHERE p.ppaDate = :ppaDate")
    , @NamedQuery(name = "PpaInfo.findByPpaExpiration", query = "SELECT p FROM PpaInfo p WHERE p.ppaExpiration = :ppaExpiration")})
public class PpaInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "palId")
    private Integer palId;
    @Size(max = 45)
    @Column(name = "ppaDate")
    private String ppaDate;
    @Size(max = 45)
    @Column(name = "ppaExpiration")
    private String ppaExpiration;

    public PpaInfo() {
    }

    public PpaInfo(Integer palId) {
        this.palId = palId;
    }

    public Integer getPalId() {
        return palId;
    }

    public void setPalId(Integer palId) {
        this.palId = palId;
    }

    public String getPpaDate() {
        return ppaDate;
    }

    public void setPpaDate(String ppaDate) {
        this.ppaDate = ppaDate;
    }

    public String getPpaExpiration() {
        return ppaExpiration;
    }

    public void setPpaExpiration(String ppaExpiration) {
        this.ppaExpiration = ppaExpiration;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (palId != null ? palId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PpaInfo)) {
            return false;
        }
        PpaInfo other = (PpaInfo) object;
        if ((this.palId == null && other.palId != null) || (this.palId != null && !this.palId.equals(other.palId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ch.keybridge.lib.cbrs.pal.PpaInfo[ palId=" + palId + " ]";
    }
    
}
