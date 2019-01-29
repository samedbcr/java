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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sammy
 */
@Entity
@Table(name = "kitaplar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kitaplar_1.findAll", query = "SELECT k FROM Kitaplar_1 k")
    , @NamedQuery(name = "Kitaplar_1.findByAdi", query = "SELECT k FROM Kitaplar_1 k WHERE k.adi = :adi")
    , @NamedQuery(name = "Kitaplar_1.findBySayfa", query = "SELECT k FROM Kitaplar_1 k WHERE k.sayfa = :sayfa")
    , @NamedQuery(name = "Kitaplar_1.findByYazar", query = "SELECT k FROM Kitaplar_1 k WHERE k.yazar = :yazar")
    , @NamedQuery(name = "Kitaplar_1.findByYayinEvi", query = "SELECT k FROM Kitaplar_1 k WHERE k.yayinEvi = :yayinEvi")})
public class Kitaplar_1 implements Serializable {

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
    @Column(name = "yayinEvi")
    private String yayinEvi;

    public Kitaplar_1() {
    }

    public Kitaplar_1(String adi) {
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

    public String getYayinEvi() {
        return yayinEvi;
    }

    public void setYayinEvi(String yayinEvi) {
        String oldYayinEvi = this.yayinEvi;
        this.yayinEvi = yayinEvi;
        changeSupport.firePropertyChange("yayinEvi", oldYayinEvi, yayinEvi);
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
        if (!(object instanceof Kitaplar_1)) {
            return false;
        }
        Kitaplar_1 other = (Kitaplar_1) object;
        if ((this.adi == null && other.adi != null) || (this.adi != null && !this.adi.equals(other.adi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kitapsatisi.model.Kitaplar_1[ adi=" + adi + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
