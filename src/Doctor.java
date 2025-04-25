public class Doctor {

    int avgTime;
    int currentQueueTime;


    Doctor(int avgTime){
        this.avgTime = avgTime;
        this.currentQueueTime = avgTime;
    }


    public void setCurrentQueueTime(int currentQueueTime){
        this.currentQueueTime = currentQueueTime;
    }
}
