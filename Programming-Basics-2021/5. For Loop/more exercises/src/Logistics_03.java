import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfLoads= Integer.parseInt(scan.nextLine());
        int sum=0;
        int bus=0;
        int truck=0;
        int train=0;
        int sumBus=0;
        int sumTruck=0;
        int sumTrain=0;
        double average=0.00;
        for (int i = 0; i <numberOfLoads; i++) {
            int tonnageOfCargo= Integer.parseInt(scan.nextLine());
            if(tonnageOfCargo>=0 && tonnageOfCargo<=3) {
                sum+= tonnageOfCargo;
                sumBus+=tonnageOfCargo;
                bus+= tonnageOfCargo * 200;
            } else if(tonnageOfCargo>=4 && tonnageOfCargo<=11) {
                sum+= tonnageOfCargo;
                sumTruck+=tonnageOfCargo;
                truck+= tonnageOfCargo * 175;
            } else if (tonnageOfCargo>=12) {
                sum+=tonnageOfCargo;
                sumTrain+=tonnageOfCargo;
                train+=tonnageOfCargo * 120;
            }

        }
        average = (bus + truck + train)*1.0 /sum;
        double microbus= (sumBus*1.0 /sum) *100;
        double trucks= (sumTruck*1.0 /sum) *100;
        double trains= (sumTrain*1.0 /sum) *100;
        System.out.printf("%.2f%n", average);
        System.out.printf("%.2f%%%n", microbus);
        System.out.printf("%.2f%%%n", trucks);
        System.out.printf("%.2f%%", trains);
    }
}
