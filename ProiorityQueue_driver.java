public class ProiorityQueue_driver {
        // --- quick demo ---
        public static void main(String[] args) {
            PriorityQueue er = new PriorityQueue();
            er.addPatient("Alice", er.FAIR);
            er.addPatient("Bob", er.CRITICAL);
            er.addPatient("Charlie", er.SERIOUS);
            er.addPatient("Diana", er.FAIR);
            er.addPatient("Ethan", er.CRITICAL);
            
            System.out.println("Serving next patient: " + er.serveNextPatient());
            System.out.println("Serving next patient: " + er.serveNextPatient());
            System.out.println("Next patient in queue: " + er.nextPatientInQueue());
            System.out.println("----------------------------");
            System.out.printf("Patients waiting list: %d\n", er.patientsWaitingList());
            System.out.println("----------------------------");
            System.out.println("Serving next patient: " + er.serveNextPatient());
            System.out.println("Serving next patient: " + er.serveNextPatient());
            System.out.println("Serving next patient: " + er.serveNextPatient());
            System.out.println(er.serveNextPatient());

}}

