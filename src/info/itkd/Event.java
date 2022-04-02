package info.itkd;

public class Event {

    private Object src;

    public Event(Object src) {
        this.src = src;
    }

    public Object getSrc() {
        return src;
    }
}
