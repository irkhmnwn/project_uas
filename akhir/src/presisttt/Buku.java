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
@Table(name = "buku")
@NamedQueries({
    @NamedQuery(name = "Buku.findAll", query = "SELECT b FROM Buku b"),
    @NamedQuery(name = "Buku.findByIdBuku", query = "SELECT b FROM Buku b WHERE b.idBuku = :idBuku"),
    @NamedQuery(name = "Buku.findByIsbn", query = "SELECT b FROM Buku b WHERE b.isbn = :isbn"),
    @NamedQuery(name = "Buku.findByJudulBuku", query = "SELECT b FROM Buku b WHERE b.judulBuku = :judulBuku"),
    @NamedQuery(name = "Buku.findByPenerbit", query = "SELECT b FROM Buku b WHERE b.penerbit = :penerbit"),
    @NamedQuery(name = "Buku.findByBahasa", query = "SELECT b FROM Buku b WHERE b.bahasa = :bahasa"),
    @NamedQuery(name = "Buku.findByTahunTerbit", query = "SELECT b FROM Buku b WHERE b.tahunTerbit = :tahunTerbit"),
    @NamedQuery(name = "Buku.findByJumlah", query = "SELECT b FROM Buku b WHERE b.jumlah = :jumlah")})
public class Buku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_buku")
    private String idBuku;
    @Column(name = "isbn")
    private String isbn;
    @Basic(optional = false)
    @Column(name = "judul_buku")
    private String judulBuku;
    @Basic(optional = false)
    @Column(name = "penerbit")
    private String penerbit;
    @Basic(optional = false)
    @Column(name = "bahasa")
    private String bahasa;
    @Basic(optional = false)
    @Column(name = "tahun_terbit")
    private int tahunTerbit;
    @Basic(optional = false)
    @Column(name = "jumlah")
    private int jumlah;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idBuku")
    private Collection<PinjamBuku> pinjamBukuCollection;

    public Buku() {
    }

    public Buku(String idBuku) {
        this.idBuku = idBuku;
    }

    public Buku(String idBuku, String judulBuku, String penerbit, String bahasa, int tahunTerbit, int jumlah) {
        this.idBuku = idBuku;
        this.judulBuku = judulBuku;
        this.penerbit = penerbit;
        this.bahasa = bahasa;
        this.tahunTerbit = tahunTerbit;
        this.jumlah = jumlah;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getBahasa() {
        return bahasa;
    }

    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
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
        hash += (idBuku != null ? idBuku.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buku)) {
            return false;
        }
        Buku other = (Buku) object;
        if ((this.idBuku == null && other.idBuku != null) || (this.idBuku != null && !this.idBuku.equals(other.idBuku))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presisttt.Buku[ idBuku=" + idBuku + " ]";
    }
    
}
