FROM centos

RUN yum install -y java

VOLUME /tmp

ADD HelloWorld-0.0.1-SNAPSHOT.jar HelloWorld.jar

RUN sh -c 'touch /HelloWorld.jar'

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/HelloWorld.jar"]


