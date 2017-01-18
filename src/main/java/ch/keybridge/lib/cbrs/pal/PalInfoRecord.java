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
@Entity(name = "PalInfoRecord")
@Table(name = "PalInfoRecord")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PalInfoRecord.findAll", query = "SELECT p FROM PalInfoRecord p")
    , @NamedQuery(name = "PalInfoRecord.findByPalId", query = "SELECT p FROM PalInfoRecord p WHERE p.palId = :palId")
    , @NamedQuery(name = "PalInfoRecord.findByLicensee", query = "SELECT p FROM PalInfoRecord p WHERE p.licensee = :licensee")
    , @NamedQuery(name = "PalInfoRecord.findByUserId", query = "SELECT p FROM PalInfoRecord p WHERE p.userId = :userId")
    , @NamedQuery(name = "PalInfoRecord.findByRegistrationInformationId", query = "SELECT p FROM PalInfoRecord p WHERE p.registrationInformationId = :registrationInformationId")
    , @NamedQuery(name = "PalInfoRecord.findByLicense", query = "SELECT p FROM PalInfoRecord p WHERE p.license = :license")
    , @NamedQuery(name = "PalInfoRecord.findByLicenseStatus", query = "SELECT p FROM PalInfoRecord p WHERE p.licenseStatus = :licenseStatus")
    , @NamedQuery(name = "PalInfoRecord.findByChannelAssignment", query = "SELECT p FROM PalInfoRecord p WHERE p.channelAssignment = :channelAssignment")})
public class PalInfoRecord implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "palId")
    private Integer palId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "licensee")
    private String licensee;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "userId")
    private String userId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "registrationInformationId")
    private String registrationInformationId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "license")
    private String license;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "licenseStatus")
    private String licenseStatus;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "channelAssignment")
    private String channelAssignment;

    public PalInfoRecord() {
    }

    public PalInfoRecord(Integer palId) {
        this.palId = palId;
    }

    public PalInfoRecord(Integer palId, String licensee, String userId, String registrationInformationId, String license, String licenseStatus, String channelAssignment) {
        this.palId = palId;
        this.licensee = licensee;
        this.userId = userId;
        this.registrationInformationId = registrationInformationId;
        this.license = license;
        this.licenseStatus = licenseStatus;
        this.channelAssignment = channelAssignment;
    }

    public Integer getPalId() {
        return palId;
    }

    public void setPalId(Integer palId) {
        this.palId = palId;
    }

    public String getLicensee() {
        return licensee;
    }

    public void setLicensee(String licensee) {
        this.licensee = licensee;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRegistrationInformationId() {
        return registrationInformationId;
    }

    public void setRegistrationInformationId(String registrationInformationId) {
        this.registrationInformationId = registrationInformationId;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicenseStatus() {
        return licenseStatus;
    }

    public void setLicenseStatus(String licenseStatus) {
        this.licenseStatus = licenseStatus;
    }

    public String getChannelAssignment() {
        return channelAssignment;
    }

    public void setChannelAssignment(String channelAssignment) {
        this.channelAssignment = channelAssignment;
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
        if (!(object instanceof PalInfoRecord)) {
            return false;
        }
        PalInfoRecord other = (PalInfoRecord) object;
        if ((this.palId == null && other.palId != null) || (this.palId != null && !this.palId.equals(other.palId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ch.keybridge.lib.cbrs.pal.PalInfoRecord[ palId=" + palId + " ]";
    }
    
}
