package com.linkedin.gestionnaireLivres;

import java.sql.*;

public class GestionnaireMySQL {

    // Paramètres de connexion à la base de données
    static final String URL = "jdbc:mysql://localhost:3306/gestionlivres";
    static final String UTILISATEUR = "root";
    static final String MOT_DE_PASSE = null;  // Utilisateur sans mot de passe

    public static void main(String[] args) {
        // Créez une instance de GestionnaireMySQL
        GestionnaireMySQL gestionnaireMySQL = new GestionnaireMySQL();

        // Exemple d'appel de la méthode pour ajouter un livre
        Livre livre1 = new Livre("Titr1e", "Auteur1" , 2013);
        Livre livre2 = new Livre("Titre2", "Auteur2" , 2015);
        Livre livre3 = new Livre("Titre3", "Auteur3" , 2016);

       // gestionnaireMySQL.ajouterLivre(livre1);
        //gestionnaireMySQL.ajouterLivre(livre2);
       // gestionnaireMySQL.ajouterLivre(livre3);
        gestionnaireMySQL.afficherTousLesLivres();
        System.out.println("-----------------------------------------------");
        gestionnaireMySQL.afficherLesLivrespuplierAvant2022(2015);

    }

    // Méthode pour ajouter un livre à la base de données
    public void ajouterLivre(Livre livre) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;

        try {
            // Établir la connexion à la base de données
            connexion = DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE);

            // Requête SQL pour l'insertion d'un livre
            String requeteInsertion = "INSERT INTO livre (titre, auteur, anneePublication) VALUES (?, ?, ?)";
            preparedStatement = connexion.prepareStatement(requeteInsertion);

            // Définir les valeurs du livre
            preparedStatement.setString(1, livre.getTitre());
            preparedStatement.setString(2, livre.getAuteur());
            preparedStatement.setString(3, String.valueOf(livre.getAnneePublication()));


            // Exécution de la requête d'insertion
            int lignesAffectees = preparedStatement.executeUpdate();

            if (lignesAffectees > 0) {
                System.out.println("Livre ajouté avec succès !");
            } else {
                System.out.println("Échec de l'ajout du livre.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermeture des ressources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connexion != null) connexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Méthode pour afficher tous les livres de la base de données
    public void afficherTousLesLivres() {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Établir la connexion à la base de données
            connexion = DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE);

            // Requête SQL pour récupérer tous les livres
            String requeteSelection = "SELECT * FROM livre";
            preparedStatement = connexion.prepareStatement(requeteSelection);

            // Exécution de la requête de sélection
            resultSet = preparedStatement.executeQuery();

            // Affichage des résultats
            while (resultSet.next()) {
                int idLivre = resultSet.getInt("id");
                String titre = resultSet.getString("titre");
                String auteur = resultSet.getString("auteur");
                String anneePublication = resultSet.getString("anneePublication");

                System.out.println("ID : " + idLivre + ", Titre : " + titre + ", Auteur : " + auteur + ", Année de publication : " + anneePublication);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermeture des ressources
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connexion != null) connexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void afficherLesLivrespuplierAvant2022(int year) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Établir la connexion à la base de données
            connexion = DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE);

            // Requête SQL pour récupérer tous les livres
            String requeteSelection = "SELECT * FROM livre where anneePublication <"+year;
            preparedStatement = connexion.prepareStatement(requeteSelection);

            // Exécution de la requête de sélection
            resultSet = preparedStatement.executeQuery();

            // Affichage des résultats
            while (resultSet.next()) {
                int idLivre = resultSet.getInt("id");
                String titre = resultSet.getString("titre");
                String auteur = resultSet.getString("auteur");
                String anneePublication = resultSet.getString("anneePublication");

                System.out.println("ID : " + idLivre + ", Titre : " + titre + ", Auteur : " + auteur + ", Année de publication : " + anneePublication);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermeture des ressources
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connexion != null) connexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
