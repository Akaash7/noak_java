
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class QueueUtilTest {

    @Test
    public void CaseStudy2Question1() {
        QueueUtil queueUtil = new QueueUtil();
        List<Doctor> doctors = Arrays.asList(
                new Doctor(3),
                new Doctor(4)
        );

        int ticketNumber = 11;
        int result = queueUtil.calcTime(doctors, ticketNumber);
        assert (result == 16);
    }
}