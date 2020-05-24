package xyz.nobaday.designpattern.observer;

import java.util.Date;

public class Event<B> {

    private Date date;

    private Baby source;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Baby getSource() {
        return source;
    }

    public void setSource(Baby source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Event{" +
                ", date=" + date +
                ", source=" + source +
                '}';
    }
}
