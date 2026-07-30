# Budget Manager (SQLite)

<img src="images/accueil.png" alt="Application Preview" width="850">

A desktop application developed with **Java Swing** that allows users to manage a personal budget and track expenses through an intuitive graphical interface. All data is stored in an embedded **SQLite** database, making the application portable and eliminating the need to install or configure a database server.

---

## Download

A ready-to-use Windows version of the application is available in the **Releases** section of this repository.

1. Download **BDDapp.zip** from **Releases**.
2. Extract the ZIP archive.
3. Open the **BDDapp** folder.
4. Launch **BDDapp.exe**.

> **Important:** Keep all files inside the **BDDapp** folder together, as they are required for the application to function correctly.

---

# Features

* Create and edit a budget.
* Add new expenses.
* Edit existing expenses.
* Delete expenses.
* Organize expenses by category.
* Manage payment methods.
* Record income.
* Display expense statistics.
* Automatically calculate the remaining budget.
* Display a warning when the budget becomes negative.
* Automatically save all data in an embedded SQLite database.

---

# Technologies Used

* Java 17
* Java Swing
* JDBC
* SQLite
* IntelliJ IDEA

---

# Database

The application uses an embedded **SQLite** database (`gestion_depenses.db`) containing the following tables:

* `budget`
* `depense`
* `categorie`
* `moyen_paiement`
* `revenu`

Since the database is embedded, no additional setup or configuration is required.

---

## Dashboard and Statistics

*Main dashboard displaying expense statistics and budget usage.*

<img src="images/accueil.png" alt="Dashboard" width="700">

---

## Budget Management

*Displays the current budget and the remaining available amount.*

<img src="images/budget(vide).png" alt="Budget" width="700">

---

## Expense Management

*Form for adding new expenses and table displaying all recorded expenses.*

<img src="images/depense(vide).png" alt="Empty Expense List" width="700">

<img src="images/depense.png" alt="Expense List" width="700">

---

## Category Management

*Interface for creating and managing expense categories.*

<img src="images/categorie(vide).png" alt="Empty Categories" width="700">

<img src="images/categorie.png" alt="Categories" width="700">

---

## Payment Method Management

*Interface for managing different payment methods.*

<img src="images/paiement(vide).png" alt="Empty Payment Methods" width="700">

<img src="images/paiement.png" alt="Payment Methods" width="700">

---

## Empty Database

*Application state when no expenses have been recorded yet.*

<img src="images/accueil(vide).png" alt="Empty Dashboard" width="700">

---

## Negative Budget Warning

*Example of the warning displayed when expenses exceed the available budget.*

<img src="images/budgetnegatif.png" alt="Negative Budget Warning" width="700">

---

# Advantages of the SQLite Version

* No MySQL installation required.
* No database server configuration.
* Embedded SQLite database.
* Portable and easy to use.
* Simplified deployment.
* Stores all data locally.

---

# Future Improvements

* Filter expenses by month.
* Search expenses.
* Export data to PDF or Excel.
* User authentication.
* Dark mode.

---

# Running from Source

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Make sure the SQLite JDBC driver is included.
4. Build and run the application.

---

# Author

Developed by **DJOUBER Dina** to strengthen skills in Java programming, object-oriented programming, Swing GUI development, JDBC, and SQLite database management.
