package neo.matrix.reversing.model;

import java.math.BigDecimal;

public interface Subject {

    Subject getChild(BigDecimal[] position);

    void addChild(Subject child);

    void removeChild(Subject child);

    BigDecimal[] getPosition();

}
