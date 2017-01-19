/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.keybridge.lib.cbrs.pal;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author nirajan
 */
@Embeddable
public class RegistrationInformationPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "frn")
    private String frn;

    public RegistrationInformationPK() {
    }

    public RegistrationInformationPK(int id, String frn) {
        this.id = id;
        this.frn = frn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrn() {
        return frn;
    }

    public void setFrn(String frn) {
        this.frn = frn;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.frn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RegistrationInformationPK other = (RegistrationInformationPK) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.frn, other.frn)) {
            return false;
        }
        return true;
    }





    @Override
    public String toString() {
        return "ch.keybridge.lib.cbrs.pal.RegistrationInformationPK[ id=" + id + ", frn=" + frn + " ]";
    }
    
}
