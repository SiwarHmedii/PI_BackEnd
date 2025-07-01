# Étape 1 : Utiliser une image base Maven pour construire l'application
FROM maven:3.9.1-eclipse-temurin-20 AS build

WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Étape 2 : Utiliser une image JRE pour exécuter l'application
FROM eclipse-temurin:20-jre-alpine
WORKDIR /app

# Copier le fichier JAR généré depuis l'étape de construction
COPY --from=build /app/target/*.jar app.jar

# Copier le script wait-for-it.sh pour gérer les dépendances
COPY wait-for-it.sh /wait-for-it.sh
RUN chmod +x /wait-for-it.sh

# Exposer le port 8081
EXPOSE 8081

# Définir le point d'entrée pour démarrer l'application
ENTRYPOINT ["/wait-for-it.sh", "mysql:3306", "-t", "60", "--", "java", "-jar", "app.jar"]