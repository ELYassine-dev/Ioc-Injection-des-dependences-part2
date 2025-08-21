package presentations;

import metier.Metiers;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pres1_Xml {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Metiers metier=(Metiers) context.getBean("metier");
        System.out.println("rest est : "+metier.calcul());



    }
}
