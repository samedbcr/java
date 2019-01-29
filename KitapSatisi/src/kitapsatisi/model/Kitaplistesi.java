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
@Table(name = "kitaplistesi", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Kitaplistesi.findAll", query = "SELECT k FROM Kitaplistesi k")
    , @NamedQuery(name = "Kitaplistesi.findByAdi", query = "SELECT k FROM Kitaplistesi k WHERE k.adi = :adi")
    , @NamedQuery(name = "Kitaplistesi.findBySayfa", query = "SELECT k FROM Kitaplistesi k WHERE k.sayfa = :sayfa")
    , @NamedQuery(name = "Kitaplistesi.findByYazar", query = "SELECT k FROM Kitaplistesi k WHERE k.yazar = :yazar")
    , @NamedQuery(name = "Kitaplistesi.findByYayinevi", query = "SELECT k FROM Kitaplistesi k WHERE k.yayinevi = :yayinevi")
    , @NamedQuery(name = "Kitaplistesi.findByFiyat", query = "SELECT k FROM Kitaplistesi k WHERE k.fiyat = :fiyat")})
public class Kitaplistesi implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
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

    public Kitaplistesi() {
    }

    public Kitaplistesi(String adi) {
        this.adi = adi;
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
        hash += (adi != null ? adi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kitaplistesi)) {
            return false;
        }
        Kitaplistesi other = (Kitaplistesi) object;
        if ((this.adi == null && other.adi != null) || (this.adi != null && !this.adi.equals(other.adi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kitapsatisi.model.Kitaplistesi[ adi=" + adi + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
