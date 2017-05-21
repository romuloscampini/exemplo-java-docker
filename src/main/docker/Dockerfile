FROM romuloscampini/jdk-oracle:8

#Cria o volume padrão para aplicação
VOLUME /opt/deploy/app-java

#Adiciona a aplicação
ADD exemplo-java-docker-0.1.jar app.jar

#Executa o comando touch no jar da aplicação para atualizar a data de modificação
RUN sh -c 'touch /app.jar'

#Configura as variáveis do Java
ENV JAVA_OPTS=""

#Comando para executar a aplicação
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]