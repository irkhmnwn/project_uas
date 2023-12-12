/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presisttt;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Irkhamnawan
 */
@Entity
@Table(name = "mahasiswa")
@NamedQueries({
    @NamedQuery(name = "Mahasiswa.findAll", query = "SELECT m FROM Mahasiswa m"),
    @NamedQuery(name = "Mahasiswa.findByIdMahasiswa", query = "SELECT m FROM Mahasiswa m WHERE m.idMahasiswa = :idMahasiswa"),
    @NamedQuery(name = "Mahasiswa.findByNama", query = "SELECT m FROM Mahasiswa m WHERE m.nama = :nama"),
    @NamedQuery(name = "Mahasiswa.findByNim", query = "SELECT m FROM Mahasiswa m WHERE m.nim = :nim"),
    @NamedQuery(name = "Mahasiswa.findByProdi", query = "SELECT m FROM Mahasiswa m WHERE m.prodi = :prodi"),
    @NamedQuery(name = "Mahasiswa.findByFakultas", query = "SELECT m FROM Mahasiswa m WHERE m.fakultas = :fakultas"),
    @NamedQuery(name = "Mahasiswa.findBySemester", query = "SELECT m FROM Mahasiswa m WHERE m.semester = :semester"),
    @NamedQuery(name = "Mahasiswa.findByEmail", query = "SELECT m FROM Mahasiswa m WHERE m.email = :email"),
    @NamedQuery(name = "Mahasiswa.findByAlamat", query = "SELECT m FROM Mahasiswa m WHERE m.alamat = :alamat")})
public class Mahasiswa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_mahasiswa")
    private String idMahasiswa;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "nim")
    private String nim;
    @Basic(optional = false)
    @Column(name = "prodi")
    private String prodi;
    @Basic(optional = false)
    @Column(name = "fakultas")
    private String fakultas;
    @Basic(optional = false)
    @Column(name = "semester")
    private int semester;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "alamat")
    private String alamat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMahasiswa")
    private Collection<PinjamSkripsi> pinjamSkripsiCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMahasiswa")
    private Collection<PinjamBuku> pinjamBukuCollection;

    public Mahasiswa() {
    }

    public Mahasiswa(String idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }

    public Mahasiswa(String idMahasiswa, String nama, String nim, String prodi, String fakultas, int semester, String email, String alamat) {
        this.idMahasiswa = idMahasiswa;
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
        this.semester = semester;
        this.email = email;
        this.alamat = alamat;
    }

    public String getIdMahasiswa() {
        return idMahasiswa;
    }

    public void setIdMahasiswa(String idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Collection<PinjamSkripsi> getPinjamSkripsiCollection() {
        return pinjamSkripsiCollection;
    }

    public void setPinjamSkripsiCollection(Collection<PinjamSkripsi> pinjamSkripsiCollection) {
        this.pinjamSkripsiCollection = pinjamSkripsiCollection;
    }

    public Collection<PinjamBuku> getPinjamBukuCollection() {
        return pinjamBukuCollection;
    }

    public void setPinjamBukuCollection(Collection<PinjamBuku> pinjamBukuCollection) {
        this.pinjamBukuCollection = pinjamBukuCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMahasiswa != null ? idMahasiswa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mahasiswa)) {
            return false;
        }
        Mahasiswa other = (Mahasiswa) object;
        if ((this.idMahasiswa == null && other.idMahasiswa != null) || (this.idMahasiswa != null && !this.idMahasiswa.equals(other.idMahasiswa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presisttt.Mahasiswa[ idMahasiswa=" + idMahasiswa + " ]";
    }
    
}
