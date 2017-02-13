FROM tomcat:8.0.20-jre8
COPY /FirstProject/target/FirstProject.war /usr/local/tomcat/webapps/FirstProject.war