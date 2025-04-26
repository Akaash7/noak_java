import java.util.List;
import java.util.PriorityQueue;

public class QueueUtil {
    public int calcTime(List<Doctor> doctors, int ticketNumber){

        // Doctor is available right away
        if(ticketNumber <= doctors.size()){
            return 0;
        }

        PriorityQueue<Doctor> queue = new PriorityQueue<>((a, b) -> {
            if(a.currentQueueTime < b.currentQueueTime){
                return -1;
            } else if(a.currentQueueTime > b.currentQueueTime){
                return 1;
            } else {
                return Integer.compare(a.avgTime, b.avgTime);
            }
        });

        queue.addAll(doctors);

        // Assign Patients to all available doctors at first
        ticketNumber = ticketNumber - queue.size();

        //excluding the current person's ticket
        while( ticketNumber > 1 ){
            Doctor doctor = queue.poll();
            ticketNumber--;
            doctor.setCurrentQueueTime(doctor.currentQueueTime + doctor.avgTime);
            queue.add(doctor);
        }

        // heap has least queue time value on top
        return queue.peek().currentQueueTime;
    }

}
