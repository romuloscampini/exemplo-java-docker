# Criação de imagem Docker de app em java

Projeto para demonstrar a criação de imagem Docker de aplicação em java utilizando plugin no Maven

Para esse projeto foi utilizado o plugin criado pelo spotify

Para criar a imagem
```
mvn clean package docker:build
mvn clean package docker:build -DpushImage
```
Imagem criada com nome: romuloscampini/exemplo-java-docker
