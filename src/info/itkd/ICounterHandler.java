package info.itkd;

@FunctionalInterface
public interface ICounterHandler {
    public void handle(CounterEvent evt);
}
