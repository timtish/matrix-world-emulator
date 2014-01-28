package neo.matrix.reversing.process;

import neo.matrix.reversing.model.Event;

public interface EventController {

    void fireEvent(Event event);

}
