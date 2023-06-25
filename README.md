# kafka-producer-demo
kafka-producer-demo
download kafka from here: https://www.apache.org/dyn/closer.cgi?path=/kafka/3.4.0/kafka_2.13-3.4.0.tgz

open /config/server.properties => change the log.dirs path to c:/kafka/kafka-logs
open /config/zookeeper.properties => dataDir path to c:/kafka/zookeeper-data

to start the zookeeper server
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

to start the kafka server
.\bin\windows\kafka-server-start.bat .\config\server.properties

to create a topic
.\bin\windows\kafka-topics.bat --create --topic test-topic --bootstrap-server localhost:9092 --replication-factor 1 --partitions 4

to list all the topics
.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

to send messages from kafka
.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic test-topic

to recieve messages in kafka
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test-topic --from-beginning
