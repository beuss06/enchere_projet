package fr.eni;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "ENCHERES", schema = "dbo", catalog = "ENCHERE_DB")
@IdClass(fr.eni.EncheresEntityPK.class)
public class EncheresEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "no_utilisateur", nullable = false)
    private int noUtilisateur;

    public int getNoUtilisateur() {
        return noUtilisateur;
    }

    public void setNoUtilisateur(int noUtilisateur) {
        this.noUtilisateur = noUtilisateur;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "no_article", nullable = false)
    private int noArticle;

    public int getNoArticle() {
        return noArticle;
    }

    public void setNoArticle(int noArticle) {
        this.noArticle = noArticle;
    }

    @Basic
    @Column(name = "date_enchere", nullable = false)
    private Date dateEnchere;

    public Date getDateEnchere() {
        return dateEnchere;
    }

    public void setDateEnchere(Date dateEnchere) {
        this.dateEnchere = dateEnchere;
    }

    @Basic
    @Column(name = "montant_enchere", nullable = false)
    private int montantEnchere;

    public int getMontantEnchere() {
        return montantEnchere;
    }

    public void setMontantEnchere(int montantEnchere) {
        this.montantEnchere = montantEnchere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EncheresEntity that = (EncheresEntity) o;
        return noUtilisateur == that.noUtilisateur && noArticle == that.noArticle && montantEnchere == that.montantEnchere && Objects.equals(dateEnchere, that.dateEnchere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noUtilisateur, noArticle, dateEnchere, montantEnchere);
    }
}
