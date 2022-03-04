import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanTwo = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean == beanTwo);

        ApplicationContext applicationContextCat =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beanCat = (Cat) applicationContextCat.getBean("cat");
        System.out.println(beanCat.getName());
        Cat beanCatTwo = (Cat) applicationContextCat.getBean("cat");
        System.out.println(beanCat == beanCatTwo);

    }
}