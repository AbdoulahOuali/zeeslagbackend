package nl.hva.projectewa.teamc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Schip {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 150)
    private String typeSchip;
    @Column(length = 1000)
    private String beschrijving;

    private Integer lengteSchip;

    private String imageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeSchip() {
        return typeSchip;
    }

    public void setTypeSchip(String typeSchip) {
        this.typeSchip = typeSchip;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public Integer getLengteSchip() {
        return lengteSchip;
    }

    public void setLengteSchip(Integer lengteSchip) {
        this.lengteSchip = lengteSchip;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Schip{" +
                "id=" + id +
                ", typeSchip='" + typeSchip + '\'' +
                ", beschrijving='" + beschrijving + '\'' +
                ", lengteSchip=" + lengteSchip +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
