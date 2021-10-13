package MessageService;

import org.springframework.stereotype.Component;

@Component
class EnglishMessage implements Message {
    @Override
    public String getMessage() {
        return "Message in English";
    }
}
