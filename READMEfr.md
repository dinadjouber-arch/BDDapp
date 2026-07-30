# Gestionnaire de Budget (SQLite)

<img src="images/accueil.png" alt="Aperçu de l'application" width="850">

Une application de bureau développée en **Java Swing** permettant de gérer un budget personnel et de suivre ses dépenses grâce à une interface graphique intuitive. Toutes les données sont enregistrées dans une base de données **SQLite** intégrée, rendant l'application portable et ne nécessitant aucune installation ni configuration d'un serveur de base de données.

---

## Téléchargement

Une version Windows prête à l'emploi est disponible dans la section **Releases** de ce dépôt.

1. Téléchargez **BDDapp.zip** depuis **Releases**.
2. Extrayez l'archive ZIP.
3. Ouvrez le dossier **BDDapp**.
4. Lancez **BDDapp.exe**.

> **Important :** Conservez tous les fichiers présents dans le dossier **BDDapp**. Ils sont indispensables au bon fonctionnement de l'application.

---

# Fonctionnalités

* Créer et modifier un budget.
* Ajouter une nouvelle dépense.
* Modifier une dépense existante.
* Supprimer une dépense.
* Organiser les dépenses par catégorie.
* Gérer les moyens de paiement.
* Enregistrer des revenus.
* Afficher des statistiques sur les dépenses.
* Calculer automatiquement le budget restant.
* Afficher une alerte lorsque le budget devient négatif.
* Enregistrer automatiquement toutes les données dans une base de données SQLite intégrée.

---

# Technologies utilisées

* Java 17
* Java Swing
* JDBC
* SQLite
* IntelliJ IDEA

---

# Base de données

L'application utilise une base de données **SQLite** (`gestion_depenses.db`) contenant les tables suivantes :

* `budget`
* `depense`
* `categorie`
* `moyen_paiement`
* `revenu`

La base de données étant intégrée à l'application, aucune configuration supplémentaire n'est nécessaire.

---

## Tableau de bord et statistiques

*Interface principale affichant les statistiques des dépenses et l'utilisation du budget.*

<img src="images/accueil.png" alt="Accueil" width="700">

---

## Gestion du budget

*Affichage du budget actuel et du montant restant.*

<img src="images/budget(vide).png" alt="Budget" width="700">

---

## Gestion des dépenses

*Formulaire permettant d'ajouter une nouvelle dépense et tableau affichant toutes les dépenses enregistrées.*

<img src="images/depense(vide).png" alt="Liste des dépenses vide" width="700">

<img src="images/depense.png" alt="Liste des dépenses" width="700">

---

## Gestion des catégories

*Interface permettant d'ajouter et de gérer les catégories de dépenses.*

<img src="images/categorie(vide).png" alt="Catégories vides" width="700">

<img src="images/categorie.png" alt="Catégories" width="700">

---

## Gestion des moyens de paiement

*Interface permettant de gérer les différents moyens de paiement.*

<img src="images/paiement(vide).png" alt="Moyens de paiement vides" width="700">

<img src="images/paiement.png" alt="Moyens de paiement" width="700">

---

## Base de données vide

*État de l'application lorsqu'aucune dépense n'a encore été enregistrée.*

<img src="images/accueil(vide).png" alt="Application vide" width="700">

---

## Budget négatif

*Exemple de l'alerte affichée lorsque les dépenses dépassent le budget disponible.*

<img src="images/budgetnegatif.png" alt="Budget négatif" width="700">

---

# Avantages de la version SQLite

* Aucune installation de MySQL.
* Aucune configuration d'un serveur de base de données.
* Base de données SQLite intégrée.
* Application portable et simple à utiliser.
* Déploiement simplifié.
* Toutes les données sont enregistrées localement.

---

# Améliorations futures

* Filtrage des dépenses par mois.
* Recherche de dépenses.
* Export des données au format PDF ou Excel.
* Authentification des utilisateurs.
* Mode sombre.

---

# Exécution depuis le code source

1. Cloner le dépôt.
2. Ouvrir le projet avec IntelliJ IDEA.
3. Vérifier que le pilote JDBC SQLite est inclus.
4. Compiler et lancer l'application.

---

# Auteur

Développé par **DJOUBER Dina** afin de mettre en pratique la programmation Java, la programmation orientée objet, le développement d'interfaces graphiques avec Swing, JDBC et l'utilisation des bases de données SQLite.

