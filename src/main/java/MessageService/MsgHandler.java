package MessageService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MsgHandler {
    /**
     * |How using spring we can solve this
     * @param args
     */
    public static void main(String[] args) {
/*
Somehow fetch the beans whatsapp from container
*/
        ApplicationContext ctx=new AnnotationConfigApplicationContext("MessageService");
        MessageService srvice=(MessageService) ctx.getBean("whatsAppService");
        srvice.SendMessage();
    }
}
