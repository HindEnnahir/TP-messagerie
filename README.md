# Projet de Système de Messagerie Interne

## Vue d'Ensemble

Ce projet vise à développer un système de messagerie interne pour une entreprise. Il permet aux employés de communiquer en échangeant des messages via une interface simple. Ce système repose sur une base de données MySQL où sont stockées les informations des employés et des messages échangés. Le projet met en place des fonctionnalités essentielles telles que la création d'employés, l'envoi de messages, et la gestion des opérations courantes à l'aide des opérations CRUD.

## Fonctionnalités Clés

- *Gestion des employés* : Ajout, modification, et suppression des informations des employés.
- *Envoi de messages* : Les employés peuvent envoyer et recevoir des messages.
- *Consultation des messages* : Chaque employé peut consulter les messages qui lui sont adressés.
- *Connexion à MySQL* : Utilisation d'un fichier de configuration externe pour connecter l'application à une base de données MySQL.
- *CRUD complet* : Implémentation des fonctionnalités CRUD pour la gestion des employés et des messages.

## Organisation du Projet

### Fichiers Principaux
- *config.properties* : Contient les détails de connexion à la base de données MySQL.
- *Employe.java* : Classe représentant un employé.
- *Message.java* : Classe représentant un message échangé entre les employés.
- *EmployeService.java* : Gère les opérations CRUD pour les employés.
- *MessageService.java* : Gère les opérations CRUD pour les messages.
- *Messagerie.java* : Point d’entrée du projet pour tester les fonctionnalités de messagerie.
