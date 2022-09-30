package com.orgofarms.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics = "techTopic",
            groupId = "localCustomers"
    )
    void listener(String data){
        System.out.println("Listener received data = " + data);
    }
}
