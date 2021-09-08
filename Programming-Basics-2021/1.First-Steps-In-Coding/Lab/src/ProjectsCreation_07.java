import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameArchitect=scan.nextLine();
        int numberOfProjects= Integer.parseInt(scan.nextLine());
        // изчисляваме колко часа ще отнемат всичките проекти
        int hoursForExecutingAllProjects= numberOfProjects *3;
        //  разпечатваме името на архитекта, резултата, брой проекти. Използваме разпечатката за специално
        //  форматиране -System.out.printf - шаблон за String (%s), за int (%d), за double (%f), за char(%c).
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",nameArchitect,
                hoursForExecutingAllProjects,numberOfProjects);
    }
}
