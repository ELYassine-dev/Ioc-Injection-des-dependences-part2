package presentations;

import metier.Metiers;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Pres2_Annotation {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("ext","metier");
        Metiers metier=context.getBean(Metiers.class);
        System.out.println("rest est : "+metier.calcul());


    }
}
