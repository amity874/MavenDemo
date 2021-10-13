package MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FrenchMessage implements Message{
    @Override
    public String getMessage() {
        return "Message in French";
    }
}
