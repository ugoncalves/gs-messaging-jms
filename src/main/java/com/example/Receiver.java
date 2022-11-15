package com.example;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.TextMessage;
import java.util.logging.Logger;

@Component
public class Receiver {

	Logger log = Logger.getLogger("com.example");

	@JmsListener(destination = "DEV.QUEUE.1", containerFactory = "myFactory")
	public void receiveMessage(Message message) {

		if (message instanceof TextMessage) {
			TextMessage textMessage = (TextMessage) message;
			log.info(textMessage.toString());
		} else {
			log.info("Message is not a TextMessage");
		}

	}

}
