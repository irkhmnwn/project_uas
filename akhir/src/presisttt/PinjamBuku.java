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
@Table(name = "pinjam_buku")
@NamedQueries({
    @NamedQuery(name = "PinjamBuku.findAll", query = "SELECT p FROM PinjamBuku p"),
    @NamedQuery(name = "PinjamBuku.findByIdPeminjaman", query = "SELECT p FROM PinjamBuku p WHERE p.idPeminjaman = :idPeminjaman"),
    @NamedQuery(name = "PinjamBuku.findByTanggal", query = "SELECT p FROM PinjamBuku p WHERE p.tanggal = :tanggal"),
    @NamedQuery(name = "PinjamBuku.findByStatus", query = "SELECT p FROM PinjamBuku p WHERE p.status = :status")})
public class PinjamBuku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_peminjaman")
    private String idPeminjaman;
    @Basic(optional = false)
    @Column(name = "tanggal")
    private String tanggal;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "id_buku", referencedColumnName = "id_buku")
    @ManyToOne(optional = false)
    private Buku idBuku;
    @JoinColumn(name = "id_mahasiswa", referencedColumnName = "id_mahasiswa")
    @ManyToOne(optional = false)
    private Mahasiswa idMahasiswa;

    public PinjamBuku() {
    }

    public PinjamBuku(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public PinjamBuku(String idPeminjaman, String tanggal, String status) {
        this.idPeminjaman = idPeminjaman;
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
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

    public Buku getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(Buku idBuku) {
        this.idBuku = idBuku;
    }

    public Mahasiswa getIdMahasiswa() {
        return idMahasiswa;
    }

    public void setIdMahasiswa(Mahasiswa idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPeminjaman != null ? idPeminjaman.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PinjamBuku)) {
            return false;
        }
        PinjamBuku other = (PinjamBuku) object;
        if ((this.idPeminjaman == null && other.idPeminjaman != null) || (this.idPeminjaman != null && !this.idPeminjaman.equals(other.idPeminjaman))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presisttt.PinjamBuku[ idPeminjaman=" + idPeminjaman + " ]";
    }
    
}
