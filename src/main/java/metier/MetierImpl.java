package metier;

import demo.IDemo;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements Metiers{
//@Autowired
    private IDemo demo;
// ID with constructor
    MetierImpl(IDemo demo){
        this.demo = demo;
    }

    // ID with setter
    public void setDao(IDemo demo){
        this.demo=demo;
    }


    @Override
    public double calcul() {
        double d=demo.getdata();
        double data=Math.random()*d;
        return data;
    }
}
