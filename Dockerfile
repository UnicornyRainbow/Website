FROM clojure:lein AS build

COPY . /usr/src/app
WORKDIR /usr/src/app
RUN ["lein", "uberjar"]

FROM eclipse-temurin:23-jre-alpine

COPY --from=build /usr/src/app/target/uberjar/website.jar /usr/src/app/website.jar
WORKDIR /usr/src/app
EXPOSE 8000
ENV JAVA_OPTS="-Xmx4096M"
CMD java "$JAVA_OPTS" -jar website.jar
