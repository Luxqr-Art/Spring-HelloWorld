import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat cat1 = (Cat) applicationContext.getBean("myCat");
        Cat cat2 = (Cat) applicationContext.getBean("myCat");
        System.out.println(cat1.getMessage());


        System.out.println(bean == bean1);
        System.out.println(cat1 == cat2);

        ((AnnotationConfigApplicationContext)applicationContext).close();
    }
}