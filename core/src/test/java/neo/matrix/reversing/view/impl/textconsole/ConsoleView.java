package neo.matrix.reversing.view.impl.textconsole;

import neo.matrix.reversing.model.Feeling;
import neo.matrix.reversing.model.Subject;
import neo.matrix.reversing.view.FeelingView;
import neo.matrix.reversing.view.SubjectView;

public class ConsoleView implements FeelingView, SubjectView {

    @Override
    public void show(Feeling feeling) {
        System.out.println(feeling);
    }

    @Override
    public void show(Subject subject) {
        System.out.println(subject);
    }
}
