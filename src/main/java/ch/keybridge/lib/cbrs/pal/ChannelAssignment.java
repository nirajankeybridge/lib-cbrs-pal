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
@Entity(name = "ChannelAssignment")
@Table(name = "ChannelAssignment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ChannelAssignment.findAll", query = "SELECT c FROM ChannelAssignment c")
    , @NamedQuery(name = "ChannelAssignment.findById", query = "SELECT c FROM ChannelAssignment c WHERE c.id = :id")
    , @NamedQuery(name = "ChannelAssignment.findByPrimaryAssignment", query = "SELECT c FROM ChannelAssignment c WHERE c.primaryAssignment = :primaryAssignment")
    , @NamedQuery(name = "ChannelAssignment.findBySecondaryAssignment", query = "SELECT c FROM ChannelAssignment c WHERE c.secondaryAssignment = :secondaryAssignment")})
public class ChannelAssignment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "primaryAssignment")
    private String primaryAssignment;
    @Size(max = 45)
    @Column(name = "secondaryAssignment")
    private String secondaryAssignment;

    public ChannelAssignment() {
    }

    public ChannelAssignment(Integer id) {
        this.id = id;
    }

    public ChannelAssignment(Integer id, String primaryAssignment) {
        this.id = id;
        this.primaryAssignment = primaryAssignment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrimaryAssignment() {
        return primaryAssignment;
    }

    public void setPrimaryAssignment(String primaryAssignment) {
        this.primaryAssignment = primaryAssignment;
    }

    public String getSecondaryAssignment() {
        return secondaryAssignment;
    }

    public void setSecondaryAssignment(String secondaryAssignment) {
        this.secondaryAssignment = secondaryAssignment;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.primaryAssignment);
        hash = 79 * hash + Objects.hashCode(this.secondaryAssignment);
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
        final ChannelAssignment other = (ChannelAssignment) obj;
        if (!Objects.equals(this.primaryAssignment, other.primaryAssignment)) {
            return false;
        }
        if (!Objects.equals(this.secondaryAssignment, other.secondaryAssignment)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }



    @Override
    public String toString() {
        return "ch.keybridge.lib.cbrs.pal.ChannelAssignment[ id=" + id + " ]";
    }
    
}
