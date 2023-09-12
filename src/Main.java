import listworker.ListWorker;
import сlerk.Clerk;

public class Main {
    public static void main(String[] args) {
        ListWorker worker = new ListWorker();
        worker.getWorkerResult();

        Clerk clerk = new Clerk();
        clerk.getClerkResults();
    }
}