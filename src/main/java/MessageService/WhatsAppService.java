package MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Component will tell spring to create object
 * Go and create the Bean  named --wattsAppService
 * in spring container
 */
@Component
public class WhatsAppService implements MessageService{
    /**
     * Default value of object variable=null
     * I want to spring to inject message object
     */
    @Autowired//bring message bean and this will be no more null now
    private Message message;
    @Override
    public void SendMessage(){
        //null.getMessage();
        System.out.println("Sending Message :WhatsApp"+message.getMessage());
    }
}
