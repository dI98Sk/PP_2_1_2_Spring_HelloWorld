import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        // повторный вызов бина Hello world
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        //
        // beans for Cat
        //first bean
        Cat beanCat =
                (Cat) applicationContext.getBean("cat");
        //second bean
        Cat beanCat1 =
                (Cat) applicationContext.getBean("cat");
        //
        //проверка по парам
        System.out.println("First pair " + (bean == bean1)); // сравнение для Hello World
        System.out.println("Second pair " + (beanCat == beanCat1)); //сравнение для Cat
    }
}