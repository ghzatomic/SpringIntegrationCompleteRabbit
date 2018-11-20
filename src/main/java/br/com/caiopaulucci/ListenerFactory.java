package br.com.caiopaulucci;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.MessageHandler;

@Configuration
public class ListenerFactory {

	@Bean
    @ServiceActivator(inputChannel = "channel_normal_adapter")
    public MessageHandler handler() {
        return new MessageDownloadHandler();
    }
	
}