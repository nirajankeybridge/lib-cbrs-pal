/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.keybridge.lib.cbrs.pal;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nirajan
 */
@Entity(name = "RegistrationInformation")
@Table(name = "RegistrationInformation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegistrationInformation.findAll", query = "SELECT r FROM RegistrationInformation r")
    , @NamedQuery(name = "RegistrationInformation.findById", query = "SELECT r FROM RegistrationInformation r WHERE r.registrationInformationPK.id = :id")
    , @NamedQuery(name = "RegistrationInformation.findByFrn", query = "SELECT r FROM RegistrationInformation r WHERE r.registrationInformationPK.frn = :frn")
    , @NamedQuery(name = "RegistrationInformation.findByRegistrationDate", query = "SELECT r FROM RegistrationInformation r WHERE r.registrationDate = :registrationDate")
    , @NamedQuery(name = "RegistrationInformation.findByLicenseConditions", query = "SELECT r FROM RegistrationInformation r WHERE r.licenseConditions = :licenseConditions")})
public class RegistrationInformation implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RegistrationInformationPK registrationInformationPK;
    @Size(max = 45)
    @Column(name = "registrationDate")
    private String registrationDate;
    @Size(max = 64)
    @Column(name = "licenseConditions")
    private String licenseConditions;

    public RegistrationInformation() {
    }

    public RegistrationInformation(RegistrationInformationPK registrationInformationPK) {
        this.registrationInformationPK = registrationInformationPK;
    }

    public RegistrationInformation(int id, String frn) {
        this.registrationInformationPK = new RegistrationInformationPK(id, frn);
    }

    public RegistrationInformationPK getRegistrationInformationPK() {
        return registrationInformationPK;
    }

    public void setRegistrationInformationPK(RegistrationInformationPK registrationInformationPK) {
        this.registrationInformationPK = registrationInformationPK;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getLicenseConditions() {
        return licenseConditions;
    }

    public void setLicenseConditions(String licenseConditions) {
        this.licenseConditions = licenseConditions;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (registrationInformationPK != null ? registrationInformationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistrationInformation)) {
            return false;
        }
        RegistrationInformation other = (RegistrationInformation) object;
        if ((this.registrationInformationPK == null && other.registrationInformationPK != null) || (this.registrationInformationPK != null && !this.registrationInformationPK.equals(other.registrationInformationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ch.keybridge.lib.cbrs.pal.RegistrationInformation[ registrationInformationPK=" + registrationInformationPK + " ]";
    }
    
}
