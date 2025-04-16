package tasks_from_interview.atb;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    private Set<Date> dates;
    private Date lastDate;


    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.initializeDates();
        solution.upadeLastDate(360L);
        System.out.println(solution.isLastDateInDates());
        System.out.println(solution.dates.size());
    }

    public boolean isLastDateInDates(){
        return dates.contains(lastDate);
    }

    private void initializeDates(){
        dates = new HashSet<>();
        lastDate = new Date(9999999L);
        dates.add(lastDate);
        dates.add(new Date(122222L));
        dates.add(new Date(333333L));
        dates.add(new Date(444444L));
        dates.add(new Date(555555L));
    }

    protected void upadeLastDate(long delta){
        dates.remove(lastDate);
        lastDate.setTime(lastDate.getTime() - delta);
        dates.add(lastDate);
    }
}
