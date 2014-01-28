package neo.matrix.reversing.world;

import neo.matrix.reversing.model.Feeling;
import neo.matrix.reversing.model.Time;
import neo.matrix.reversing.model.impl.Architectus;
import neo.matrix.reversing.process.impl.environment.SystemTimeController;
import neo.matrix.reversing.view.impl.textconsole.ConsoleView;

public class TestConsole {

    public static void main(String[] args) throws InterruptedException {
        Architectus a = new Architectus();
        ConsoleView v = new ConsoleView();
        SystemTimeController controller = new SystemTimeController();
        v.show(a);
        a.addFeeling(new Feeling() {
        });
        v.show(a);
        for (int step = 1; step < 10; step++) {
            Time t = controller.getTime();
            a.onTimeChange(t);
            v.show(a);
            Thread.sleep(100);
        }
    }

}
