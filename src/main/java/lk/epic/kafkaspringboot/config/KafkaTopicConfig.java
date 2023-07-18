package lk.epic.kafkaspringboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic newTopic(){
        return TopicBuilder.name("myTopic").build();
    }

    @Bean
    public NewTopic newJsonTopic(){
        return TopicBuilder.name("myTopic_json").build();
    }
}
