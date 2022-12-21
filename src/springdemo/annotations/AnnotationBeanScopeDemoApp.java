package springdemo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springdemo/annotations/applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach secondCoach = context.getBean("tennisCoach", Coach.class);

        // check if they are the same
        boolean result = (theCoach == secondCoach);

        // print results
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: "+ theCoach);
        System.out.println("\nMemory location for secondCoach: " + secondCoach);

        // close context
        context.close();
    }
}
