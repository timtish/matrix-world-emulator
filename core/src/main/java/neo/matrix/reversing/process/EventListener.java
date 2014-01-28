package neo.matrix.reversing.process;

import neo.matrix.reversing.model.Event;

public interface EventListener {

    void onEvent(Event event);

}
