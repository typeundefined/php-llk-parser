package php.parser;

public class ReorderingSample {
    boolean first = false;
    boolean second = false;
    
    void setValues() {
        first = true;
        second = true;
    }
    
    void checkValues() {
        while(!second);
        assert first;
    }
}