package hw6;

import hw6.service.PersonService;
import hw6.service.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        var personService = context.getBean(PersonService.class);
        var productService = context.getBean(ProductService.class);

        System.out.println(personService.getProductListByPersonId(3L));
        System.out.println(productService.getPersonListByProductId(2L));
    }
}