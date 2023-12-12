/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presisttt;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Irkhamnawan
 */
@Entity
@Table(name = "pinjam_skripsi")
@NamedQueries({
    @NamedQuery(name = "PinjamSkripsi.findAll", query = "SELECT p FROM PinjamSkripsi p"),
    @NamedQuery(name = "PinjamSkripsi.findByIdPinjam", query = "SELECT p FROM PinjamSkripsi p WHERE p.idPinjam = :idPinjam"),
    @NamedQuery(name = "PinjamSkripsi.findByTanggal", query = "SELECT p FROM PinjamSkripsi p WHERE p.tanggal = :tanggal"),
    @NamedQuery(name = "PinjamSkripsi.findByStatus", query = "SELECT p FROM PinjamSkripsi p WHERE p.status = :status")})
public class PinjamSkripsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pinjam")
    private String idPinjam;
    @Basic(optional = false)
    @Column(name = "tanggal")
    private String tanggal;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "id_mahasiswa", referencedColumnName = "id_mahasiswa")
    @ManyToOne(optional = false)
    private Mahasiswa idMahasiswa;
    @JoinColumn(name = "id_skripsi", referencedColumnName = "id_skripsi")
    @ManyToOne(optional = false)
    private Skripsi idSkripsi;

    public PinjamSkripsi() {
    }

    public PinjamSkripsi(String idPinjam) {
        this.idPinjam = idPinjam;
    }

    public PinjamSkripsi(String idPinjam, String tanggal, String status) {
        this.idPinjam = idPinjam;
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getIdPinjam() {
        return idPinjam;
    }

    public void setIdPinjam(String idPinjam) {
        this.idPinjam = idPinjam;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Mahasiswa getIdMahasiswa() {
        return idMahasiswa;
    }

    public void setIdMahasiswa(Mahasiswa idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }

    public Skripsi getIdSkripsi() {
        return idSkripsi;
    }

    public void setIdSkripsi(Skripsi idSkripsi) {
        this.idSkripsi = idSkripsi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPinjam != null ? idPinjam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PinjamSkripsi)) {
            return false;
        }
        PinjamSkripsi other = (PinjamSkripsi) object;
        if ((this.idPinjam == null && other.idPinjam != null) || (this.idPinjam != null && !this.idPinjam.equals(other.idPinjam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presisttt.PinjamSkripsi[ idPinjam=" + idPinjam + " ]";
    }
    
}
