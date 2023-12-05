FROM openjdk:8
ENV JAR_VERSION=""
ADD system-cloud-homepage-*.jar /
ENV NACOS_ADDR=""

ENTRYPOINT ["sh","-c","java -jar -Dspring.cloud.nacos.config.server-addr=${NACOS_ADDR} -Dspring.cloud.nacos.discovery.server-addr=${NACOS_ADDR} system-cloud-homepage-${JAR_VERSION}.jar"]