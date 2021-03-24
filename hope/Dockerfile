FROM openjdk:latest
COPY ./src /src
COPY ./target /target
COPY ./files /files
#WORKDIR /src
#RUN javac -cp /target/classes -d /target/classes src/main/java/Controller.java
#ENTRYPOINT ["java","Controller"]
CMD java -cp /target/classes/Controller