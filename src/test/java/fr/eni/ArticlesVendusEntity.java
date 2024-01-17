package fr.eni;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "ARTICLES_VENDUS", schema = "dbo", catalog = "ENCHERE_DB")
public class ArticlesVendusEntity {
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
    @Column(name = "nom_article", nullable = false, length = 30)
    private String nomArticle;

    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    @Basic
    @Column(name = "description", nullable = false, length = 300)
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "date_debut_encheres", nullable = false)
    private Date dateDebutEncheres;

    public Date getDateDebutEncheres() {
        return dateDebutEncheres;
    }

    public void setDateDebutEncheres(Date dateDebutEncheres) {
        this.dateDebutEncheres = dateDebutEncheres;
    }

    @Basic
    @Column(name = "date_fin_encheres", nullable = false)
    private Date dateFinEncheres;

    public Date getDateFinEncheres() {
        return dateFinEncheres;
    }

    public void setDateFinEncheres(Date dateFinEncheres) {
        this.dateFinEncheres = dateFinEncheres;
    }

    @Basic
    @Column(name = "prix_initial", nullable = true)
    private Integer prixInitial;

    public Integer getPrixInitial() {
        return prixInitial;
    }

    public void setPrixInitial(Integer prixInitial) {
        this.prixInitial = prixInitial;
    }

    @Basic
    @Column(name = "prix_vente", nullable = true)
    private Integer prixVente;

    public Integer getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(Integer prixVente) {
        this.prixVente = prixVente;
    }

    @Basic
    @Column(name = "no_utilisateur", nullable = false)
    private int noUtilisateur;

    public int getNoUtilisateur() {
        return noUtilisateur;
    }

    public void setNoUtilisateur(int noUtilisateur) {
        this.noUtilisateur = noUtilisateur;
    }

    @Basic
    @Column(name = "no_categorie", nullable = false)
    private int noCategorie;

    public int getNoCategorie() {
        return noCategorie;
    }

    public void setNoCategorie(int noCategorie) {
        this.noCategorie = noCategorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticlesVendusEntity that = (ArticlesVendusEntity) o;
        return noArticle == that.noArticle && noUtilisateur == that.noUtilisateur && noCategorie == that.noCategorie && Objects.equals(nomArticle, that.nomArticle) && Objects.equals(description, that.description) && Objects.equals(dateDebutEncheres, that.dateDebutEncheres) && Objects.equals(dateFinEncheres, that.dateFinEncheres) && Objects.equals(prixInitial, that.prixInitial) && Objects.equals(prixVente, that.prixVente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noArticle, nomArticle, description, dateDebutEncheres, dateFinEncheres, prixInitial, prixVente, noUtilisateur, noCategorie);
    }
}
