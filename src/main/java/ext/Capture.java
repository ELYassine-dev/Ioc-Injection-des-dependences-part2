package ext;

import demo.IDemo;
import org.springframework.stereotype.Component;

@Component
public class Capture implements IDemo {
    @Override
    public double getdata() {
        return 35;
    }
}
