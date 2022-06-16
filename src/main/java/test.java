import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.WebConfig;
import web.service.UserService;


public class test {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(WebConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);

        System.out.println(userService.getAllUsers());

    }
}
