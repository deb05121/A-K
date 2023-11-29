package traffic;

public class Main {
    public static void main(String[] args) {
        System.out.println("First traffic lights:");
        TrafficLight firstTrafficLight = new TrafficLight();
        System.out.println("\nIs free: "+firstTrafficLight.isFree());
        for(int i=0; i<10; i++){
            firstTrafficLight.transition();
            System.out.println(firstTrafficLight+"\n");
        }
        System.out.println("Is free: "+firstTrafficLight.isFree());
        System.out.println();
        System.out.println("\nSecond traffic lights:\n");
        TrafficLight secondTrafficLight = new TrafficLight();
        for(int i=0; i<3; i++){

            secondTrafficLight.transition();
        }

        System.out.println("Is free: "+secondTrafficLight.isFree());

    }
}
