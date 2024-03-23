package www.wsu.edu.et;

import java.util.Calendar;

public class Reminder {
    private String text;
    private Calendar date;

    public Reminder(String text, Calendar date) {
        this.text = text;
        this.date = date;
    }

    public String getReminderText() {
        return text;
    }

    public Calendar getDateString() {
        return date;
    }
}
