# Étape 1 : Utiliser une image base Java
FROM openjdk:17-jdk-alpine

# Étape 2 : Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Étape 3 : Copier le fichier JAR généré dans le conteneurAdd commentMore actions
COPY target/*.jar app.jar

# Étape 4 : Commande à exécuter lorsque le conteneur démarreAdd commentMore actions
ENTRYPOINT ["java", "-jar", "app.jar"]
