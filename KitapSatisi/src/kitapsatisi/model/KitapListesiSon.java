/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitapsatisi.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Sammy
 */
@Entity
@Table(name = "kitapListesiSon", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "KitapListesiSon.findAll", query = "SELECT k FROM KitapListesiSon k")
    , @NamedQuery(name = "KitapListesiSon.findById", query = "SELECT k FROM KitapListesiSon k WHERE k.id = :id")
    , @NamedQuery(name = "KitapListesiSon.findByAdi", query = "SELECT k FROM KitapListesiSon k WHERE k.adi = :adi")
    , @NamedQuery(name = "KitapListesiSon.findBySayfa", query = "SELECT k FROM KitapListesiSon k WHERE k.sayfa = :sayfa")
    , @NamedQuery(name = "KitapListesiSon.findByYazar", query = "SELECT k FROM KitapListesiSon k WHERE k.yazar = :yazar")
    , @NamedQuery(name = "KitapListesiSon.findByYayinevi", query = "SELECT k FROM KitapListesiSon k WHERE k.yayinevi = :yayinevi")
    , @NamedQuery(name = "KitapListesiSon.findByFiyat", query = "SELECT k FROM KitapListesiSon k WHERE k.fiyat = :fiyat")})
public class KitapListesiSon implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "adi")
    private String adi;
    @Column(name = "sayfa")
    private String sayfa;
    @Column(name = "yazar")
    private String yazar;
    @Column(name = "yayinevi")
    private String yayinevi;
    @Column(name = "fiyat")
    private String fiyat;

    public KitapListesiSon() {
    }

    public KitapListesiSon(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        String oldAdi = this.adi;
        this.adi = adi;
        changeSupport.firePropertyChange("adi", oldAdi, adi);
    }

    public String getSayfa() {
        return sayfa;
    }

    public void setSayfa(String sayfa) {
        String oldSayfa = this.sayfa;
        this.sayfa = sayfa;
        changeSupport.firePropertyChange("sayfa", oldSayfa, sayfa);
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        String oldYazar = this.yazar;
        this.yazar = yazar;
        changeSupport.firePropertyChange("yazar", oldYazar, yazar);
    }

    public String getYayinevi() {
        return yayinevi;
    }

    public void setYayinevi(String yayinevi) {
        String oldYayinevi = this.yayinevi;
        this.yayinevi = yayinevi;
        changeSupport.firePropertyChange("yayinevi", oldYayinevi, yayinevi);
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        String oldFiyat = this.fiyat;
        this.fiyat = fiyat;
        changeSupport.firePropertyChange("fiyat", oldFiyat, fiyat);
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
        if (!(object instanceof KitapListesiSon)) {
            return false;
        }
        KitapListesiSon other = (KitapListesiSon) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kitapsatisi.model.KitapListesiSon[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
