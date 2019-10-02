# 01-assignment-quarkus-jpa-stefanleithenmayr

# Wichtige Befehle

Befehl zum Starten der gedockerten Postgres Datenbank: 	`docker run --name cardealer-postgres -p 5432:5432 -e POSTGRES_PASSWORD=passme -d postgres` <br/>
Befehl zum Starten von Quarkus: `mvn compile quarkus:dev` <br/>
Alternativ kann auch über die Maven Lifecycles kompiliert werden (siehe Tutorial von Herr Professor Stütz)