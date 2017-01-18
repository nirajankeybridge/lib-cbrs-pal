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
@Entity(name = "LicenseInformation")
@Table(name = "LicenseInformation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LicenseInformation.findAll", query = "SELECT l FROM LicenseInformation l")
    , @NamedQuery(name = "LicenseInformation.findById", query = "SELECT l FROM LicenseInformation l WHERE l.id = :id")
    , @NamedQuery(name = "LicenseInformation.findByLicenseId", query = "SELECT l FROM LicenseInformation l WHERE l.licenseId = :licenseId")
    , @NamedQuery(name = "LicenseInformation.findByLicenseDate", query = "SELECT l FROM LicenseInformation l WHERE l.licenseDate = :licenseDate")
    , @NamedQuery(name = "LicenseInformation.findByLicenseExpiration", query = "SELECT l FROM LicenseInformation l WHERE l.licenseExpiration = :licenseExpiration")
    , @NamedQuery(name = "LicenseInformation.findByLicenseAreaIdentifier", query = "SELECT l FROM LicenseInformation l WHERE l.licenseAreaIdentifier = :licenseAreaIdentifier")
    , @NamedQuery(name = "LicenseInformation.findByLicenseAreaExtent", query = "SELECT l FROM LicenseInformation l WHERE l.licenseAreaExtent = :licenseAreaExtent")
    , @NamedQuery(name = "LicenseInformation.findByLicenseFrequencyBlockId", query = "SELECT l FROM LicenseInformation l WHERE l.licenseFrequencyBlockId = :licenseFrequencyBlockId")})
public class LicenseInformation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "licenseId")
    private String licenseId;
    @Size(max = 45)
    @Column(name = "licenseDate")
    private String licenseDate;
    @Size(max = 45)
    @Column(name = "licenseExpiration")
    private String licenseExpiration;
    @Size(max = 45)
    @Column(name = "licenseAreaIdentifier")
    private String licenseAreaIdentifier;
    @Size(max = 45)
    @Column(name = "licenseAreaExtent")
    private String licenseAreaExtent;
    @Size(max = 45)
    @Column(name = "licenseFrequencyBlockId")
    private String licenseFrequencyBlockId;

    public LicenseInformation() {
    }

    public LicenseInformation(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getLicenseDate() {
        return licenseDate;
    }

    public void setLicenseDate(String licenseDate) {
        this.licenseDate = licenseDate;
    }

    public String getLicenseExpiration() {
        return licenseExpiration;
    }

    public void setLicenseExpiration(String licenseExpiration) {
        this.licenseExpiration = licenseExpiration;
    }

    public String getLicenseAreaIdentifier() {
        return licenseAreaIdentifier;
    }

    public void setLicenseAreaIdentifier(String licenseAreaIdentifier) {
        this.licenseAreaIdentifier = licenseAreaIdentifier;
    }

    public String getLicenseAreaExtent() {
        return licenseAreaExtent;
    }

    public void setLicenseAreaExtent(String licenseAreaExtent) {
        this.licenseAreaExtent = licenseAreaExtent;
    }

    public String getLicenseFrequencyBlockId() {
        return licenseFrequencyBlockId;
    }

    public void setLicenseFrequencyBlockId(String licenseFrequencyBlockId) {
        this.licenseFrequencyBlockId = licenseFrequencyBlockId;
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
        if (!(object instanceof LicenseInformation)) {
            return false;
        }
        LicenseInformation other = (LicenseInformation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ch.keybridge.lib.cbrs.pal.LicenseInformation[ id=" + id + " ]";
    }
    
}
