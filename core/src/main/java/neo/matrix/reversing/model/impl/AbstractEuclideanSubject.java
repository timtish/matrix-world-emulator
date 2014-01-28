package neo.matrix.reversing.model.impl;

import neo.matrix.reversing.model.Subject;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.LinkedList;

public class AbstractEuclideanSubject implements Subject {

    protected BigDecimal x,y,z;

    protected Subject parent;

    protected Collection<Subject> childs = new LinkedList<Subject>();
    
    @Override
    public Subject getChild(BigDecimal[] position) {
        return null;
    }

    @Override
    public void addChild(Subject child) {

    }

    @Override
    public void removeChild(Subject child) {

    }

    @Override
    public BigDecimal[] getPosition() {
        return new BigDecimal[]{x, y, z};
    }

    @Override
    public String toString() {
        return "AbstractEuclideanSubject{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", parent=" + parent +
                '}';
    }
}
