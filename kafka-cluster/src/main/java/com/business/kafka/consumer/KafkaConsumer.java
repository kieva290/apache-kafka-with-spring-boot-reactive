package com.business.kafka.consumer;

import com.business.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

    // @KafkaListener(topics= "kafka-cluster-topic", groupId = "myGroup")
    public void consumeMsg(String message) {
        log.info(format("Consuming the message from 'kafka-cluster-topic':: %s", message));
    }

   @KafkaListener(topics= "kafka-cluster-topic", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info(format("Consuming the message from 'kafka-cluster-topic':: %s", student.toString()));
    }

}
