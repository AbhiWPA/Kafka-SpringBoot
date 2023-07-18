package lk.epic.kafkaspringboot.kafka;

import lk.epic.kafkaspringboot.payLoad.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "myTopic_json", groupId = "myGroup")
    public void consume(User user) {
        LOGGER.info(String.format("Json message received --> %s", user.toString()));
    }
}
