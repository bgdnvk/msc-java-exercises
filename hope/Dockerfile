FROM openjdk:latest
COPY ./src /src
#WORKDIR /src
RUN javac src/main/java/Controller.java -d bin
#ENTRYPOINT ["java","Controller"]
CMD java -cp bin Controller