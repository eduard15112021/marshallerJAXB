package lesson;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@XmlRootElement
public class AutoPark {
    private List<Auto> autoParc;

    public List<Auto> getAutoParc() {
        return autoParc;
    }

    public void setAutoParc(List<Auto> autoParc) {
        this.autoParc = autoParc;
    }
}
