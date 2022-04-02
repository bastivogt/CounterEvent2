package info.itkd;

public class Main {

    public static void main(String[] args) {
	    Counter counter = new Counter();

        counter.setCounterStartHandler((CounterEvent evt) -> {
            System.out.println("COUNTER_START: " + evt.getCount());
        });

        counter.setCounterChangeHandler((CounterEvent evt) -> {
            System.out.println("COUNTER_CHANGE: " + evt.getCount());
        });

        /*counter.setCounterFinishHandler((CounterEvent evt) -> {
            System.out.println("COUNTER_Finish: " + evt.getCount());
        });*/

        counter.setCounterFinishHandler(new ICounterHandler() {
            @Override
            public void handle(CounterEvent evt) {
                System.out.println("COUNTER_FINISH (Anonymous Class): " + evt.getCount());
            }
        });

        counter.run();
    }
}
