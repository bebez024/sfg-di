package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    public String getEnglishGreeting() {
        return "Hello World!";
    }

    public String getGermanGreeting() {
        return "Hallo Welt!";
    }

    public String getSpanishGreeting() {
        return "Hola Mundo";
    }
}
