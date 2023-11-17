# Covid-DB_Fullstack

## Build en local via Docker

- Clonez dans un premier temps le projet :

```git clone https://github.com/numaquentin/Covid-DB_Fullstack```

- Lancez le docker-compose :

```cd Covid-DB_Fullstack && docker compose up -d```

## Build via Jenkins

- Clonez dans un premier temps le projet suivant : 

```git clone https://github.com/jredel/jenkins-compose```

- Lancez l'application : 

```cd jenkins-compose && docker compose up```

- Rendez-vous ensuite à l'adresse suivante : `http://localhost:8001`.

- Créez un nouveau pipeline avec le code contenu dans le fichier 'Jenkinsfile'

- Enfin, lancez le build pour build l'image et la push sur Dockerhub, elle sera ensuite accessible à l'adresse suivante : 

`https://hub.docker.com/u/numaquentin`
