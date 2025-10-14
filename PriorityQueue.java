public class PriorityQueue {

    public final int CRITICAL = 0;
    public final int SERIOUS  = 1;
    public final int FAIR     = 2;

    private static class Patient {
        String name;
        int priority;    // 0 (Critical), 1 (Serious), 2 (Fair)
        Patient next;
        Patient(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }
    }

    private Patient head;
    private int size = 0;

    public boolean isEmpty() { return head == null; }
    public int size() { return size; }

    public void addPatient(String name, int priority) {
        Patient newNode = new Patient(name, priority);

        if (head == null) {                 
            head = newNode;
        } else if (priority < head.priority) {
            newNode.next = head;
            head = newNode;
        } else {
            Patient prev = head;
            Patient curr = head.next;
            while (curr != null && curr.priority < priority) {
                prev = curr;
                curr = curr.next;
            }
            while (curr != null && curr.priority == priority) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = newNode;
            newNode.next = curr;
        }
        size++;
    }

    public String serveNextPatient() {
        if (head == null) return "No patients to serve.";
        String name = head.name;
        head = head.next;
        size--;
        return name;
    }

    public String nextPatientInQueue() {
        return head == null ? null : head.name;
    }

    public int patientsWaitingList() {
        int numOfPatients = 0;
        if(isEmpty()) {
            System.out.println("No patients waiting");
            return 0;
        }
        Patient current = head;
        while (current != null) {
            numOfPatients++;
            current = current.next;
        }
        return numOfPatients;
    }


}
