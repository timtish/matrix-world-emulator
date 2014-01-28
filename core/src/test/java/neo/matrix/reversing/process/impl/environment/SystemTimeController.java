package neo.matrix.reversing.process.impl.environment;

import neo.matrix.reversing.model.Time;
import neo.matrix.reversing.model.impl.GregorianTime;
import neo.matrix.reversing.process.TimeController;

public class SystemTimeController implements TimeController {

    @Override
    public Time getTime() {
        return new GregorianTime(System.currentTimeMillis());
    }

    @Override
    public void setTime(Time time) {
        throw new UnsupportedOperationException("Not allowed update system JVM time");
    }
}
