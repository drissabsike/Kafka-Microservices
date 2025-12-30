package com.javaDriss.emailService.kafka;


import com.javaDriss.basedomains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}",
                   groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent event){

        LOGGER.info(String.format("Order event recieved in email service => %s", event.toString()));

        //save the email event into database using Spring Email

    }

}
