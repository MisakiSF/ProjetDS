# ENONCE
On souhaite créer un système distribué de digital Banking basé sur les micro-services, avec la
technologie Spring et Spring Cloud. La partie qui sera traitée dans ce problème concerne la gestion de
comptes bancaire. Chaque compte appartient à un client et peut subir plusieurs opérations. Chaque
client est défini par son code, son nom et son adresse mail. Un compte est définit par son code, son
solde, sa date création, son type (COURANT ou EPARGNE) et son état (ACTIVE, SUSPENDED). Chaque
opération est définit par son numéro, sa date, son montant et son type (DEBIT ou CREDIT). On souhaite
créer deux micro-services fonctionnels pour cette application :

- Un micro-service qui permet de gérer les clients
- Un micro-service qui permet de gérer les comptes et les opérations.
Les micro-services techniques sont :
- Un Service Gateway basé sur Spring Cloud Gateway
- Un service d’enregistrement de de découverte basé sur NetFlix EUREAKA service.
- Un Micro-service de gestion de l’authentification et des autorisations basé sur Spring Security
et Json Web Tocken.

Les données des micro-services sont stockées dans des bases de données de type H2. La messagerie
asynchrone entre les micro-services se fait en utilisant le Broker KAFKA. La communication synchrone
entre les micro-services fonctionnels se fait en utilisant Open Feign. La partie back end de l’application
est basée sur Spring Cloud et la partie Frontend Web est basée sur Angular ou React.

## A. Conception :
1. Etablir une architecture technique du projet qui montre l’ensemble des microservices de l’application
2. Etablir un diagramme de classes qui montre les entités métier de l’application.

## B. Implémentation :
### Implémentation du micro-service de gestion des clients :
#### - Créer l’entité JPA Client
#### - Créer l’interface JPARepository, basée sur Spring Data
#### - Créer une API Restful permettant de gérer les clients en utilisant Spring Data Rest.
#### - Tester ce micro-service

### Implémentation du Micro-service pour la gestion des comptes et des opérations.
#### - Créer les entités JPA Compte et Operation
#### - Créer les interfaces JPA Repository basées sur Spring Data
#### - Créer une couche service (Interface et Implémentation) permettant d’implémenter les spécifications fonctionnelles suivantes en utilisant une
interface OpenFeign pour l’accès aux données des clients :
- Ajouter un compte
- Effectuer un versement d’un montant dans un compte
- Effectuter une retrait d’un montant d’un compte
- Effectuer un virement d’un compte vers un autre
- Consulter les opérations effectuées sur un compte en respectant la
pagination.
- Consulter un Compte contenant les informations sur le client.
- Activer ou suspendre un compte
#### - Créer une RestController qui permet d’exposer les opérations de la couche
service via RESTful.
#### - Tester le micro-service

### Mettre en place les services techniques :
#### - Spring Cloud Gateway
#### - Eureka Discovery Service
### Tester l’application à travers la Gateway.
