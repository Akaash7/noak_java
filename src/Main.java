import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<Doctor> doctors = new ArrayList<>();

        doctors.add(new Doctor(3));
        doctors.add(new Doctor(4));
        doctors.add(new Doctor(5));
        doctors.add(new Doctor(7));

        QueueUtil util = new QueueUtil();
        int ticketNumber = 9;

        int timeToAppointment = util.calcTime(doctors,ticketNumber);

        System.out.println("Current Waiting:- " + timeToAppointment+" Minutes");


    }


}



