FROM openjdk:16
# �������ڸ����ļ�
COPY ./ /app/
# �������
WORKDIR /app/
RUN javac -classpath .:antlr-4.9.1-complete.jar -d ./output ./Main.java
# ����ǰĿ¼��Ϊ /app/output
WORKDIR /app/output