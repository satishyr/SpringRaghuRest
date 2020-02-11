package org.sathyatech.app.config;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class AppConfig {

	@Bean
	public ConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory cf=new ActiveMQConnectionFactory();
		cf.setBrokerURL("tcp://localhost:61616");
		return cf;
	}
	
	@Bean
	public JmsTemplate jmsTemplate() {
		JmsTemplate jt=new JmsTemplate();
		jt.setConnectionFactory(connectionFactory());
		return jt;
	}
	
}
