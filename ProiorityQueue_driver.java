import java.util.Scanner;

// Name: Bahaa Mamdouh Najjar, ID: 202372990
public class ProiorityQueue_driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isQuit = false;
        int user_option;
        PriorityQueue er = new PriorityQueue();
        System.out.println("--------------Menu---------------");

        while (!isQuit) {
            System.out.printf(
                    "[1] Add Patient\n[2] Serve Next Patient\n[3] Next Patient in Queue\n[4] Patients in waiting list\n[99] Quit\n");
            System.out.print("Enter option: ");
            user_option = scanner.nextInt();
            switch (user_option) {
                case 1:
                    System.out.println("--------------Add Patient---------------");
                    System.out.println("");
                    System.out.print("Enter patient name: ");
                    String name = scanner.next();
                    System.out.println("Priority: [0] Critical [1] Serious [2] Fair");
                    System.out.print("Enter patient priority: ");
                    int priority = scanner.nextInt();
                    er.addPatient(name, priority);
                    System.out.println("");
                    System.out.println("--------------Menu---------------");
                    break;
                case 2:
                    System.out.println("--------------Serving Next Patient---------------");
                    System.out.println("");
                    System.out.println("[!] Serving next patient: " + er.serveNextPatient());
                    System.out.println("");
                    System.out.println("--------------Menu---------------");
                    break;
                case 3:
                    System.out.println("--------------Next Patient---------------");
                    System.out.println("");
                    System.out.println("[!] Next patient in queue: " + er.nextPatientInQueue());
                    System.out.println("");
                    System.out.println("--------------Menu---------------");
                    break;
                case 4:
                    System.out.println("--------------Waiting List---------------");
                    System.out.println("");
                    System.out.println("[!] Patients in waiting list: " + er.patientsWaitingList());
                    System.out.println("");
                    System.out.println("--------------Menu---------------");
                    break;
                case 99:
                    isQuit = true;
                    break;
                default:
                    System.out.println("--------------System Message---------------");
                    System.out.println("");
                    System.out.println("[!] Invalid option");
                    System.out.println("");
                    System.out.println("--------------Menu---------------");
                    break;
            }
        }

    }
}
