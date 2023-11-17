# Covid-DB_Fullstack

## Build du projet en local via Docker

- Dans un terminal, clonez le projet suivant :

```git clone https://github.com/numaquentin/Covid-DB_Fullstack```

- Entrez dans le projet et lancez le docker-compose :

```cd Covid-DB_Fullstack && docker compose up -d```

## Build du projet via Jenkins + push vers le Dockerhub

- Dans un terminal, clonez le projet suivant : 

```git clone https://github.com/jredel/jenkins-compose```

- Entrez dans le projet et lancez le docker-compose :

```cd jenkins-compose && docker compose up```

- Rendez-vous ensuite à l'adresse suivante : `http://localhost:8001` pour se connecter à Jenkins.

- Créez un nouveau pipeline avec le code contenu dans le fichier 'Jenkinsfile'.

- Enfin, lancez le build pour build l'image et la push sur Dockerhub, elle sera ensuite disponible sur `numaquentin/covid-db-fullstack`.
