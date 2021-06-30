import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }


    @Bean// Воспользовался default name
    @Scope("prototype")
    public Cat myCat() {
        Cat cat = new Cat();
        cat.setMessage("Hello my Catty");
        return cat;
    }
}