package ro.siit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaticticsRepository {
    private List<Long> times = new ArrayList<>();

    public void addCalculationTime(Long time){
        times.add(time);
    }

    public List<Long> getListOfTimes(){
        List<Long> aux = new ArrayList<>();
        for (Long time:times) {
            aux.add(time);
        }
        return aux;
    }

    public long getFastestCalculationTime(){
        return Collections.max(times);
    }

    public long getLowestCalculationTime(){
        return Collections.min(times);
    }

    public long getNoOfCalculations(){
        return times.size();
    }
}
