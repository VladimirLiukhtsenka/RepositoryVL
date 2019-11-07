package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO6;

public class TimeLogic {
    private Time time;

    public TimeLogic(Time time1) {
        this.time = time1;
    }

    public void changeHours(int hour) {
        if (time.getHour() + hour >= 0 && time.getHour() + hour < 24) {
            time.setHour(time.getHour() + hour);
        } else time.setHour(0);
    }

    public void changeMinutes(int minute) {
        if (time.getMinute() + minute >= 0 && time.getMinute() + minute < 60) {
            time.setMinute(time.getMinute() + minute);
        } else time.setMinute(0);
    }

    public void changeSeconds(int second) {
        if (time.getSecond() + second >= 0 && time.getSecond() + second < 60) {
            time.setSecond(time.getSecond() + second);
        } else time.setSecond(0);
    }
}
