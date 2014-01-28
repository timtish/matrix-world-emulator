package neo.matrix.reversing.model.impl;

import neo.matrix.reversing.model.*;
import neo.matrix.reversing.process.MindController;

import java.util.Collection;
import java.util.LinkedList;

public final class Architectus extends AbstractEuclideanSubject implements Mind, Subject, MindController {

    private Collection<Feeling> activeFeelings = new LinkedList<Feeling>();

    @Override
    public void addFeeling(Feeling feeling) {
        activeFeelings.add(feeling);
    }

    @Override
    public String toString() {
        return "Architectus{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", activeFeelings=" + activeFeelings.size() +
                '}';
    }

    @Override
    public void onEvent(Event event) {

    }

    @Override
    public void onFeeling(Feeling feeling) {

    }

    @Override
    public void onTimeChange(Time time) {
        if (activeFeelings.size() > 0) addFeeling(new Feeling() {});
    }
}
