package lesson;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Auto auto=new Auto("audi",180,1989,"5894");
        Auto auto1=new Auto("opel",175,2000,"2597");
        Auto auto2=new Auto("BMW",185,1995,"9756");
        Auto auto3=new Auto("Tesla",170,2012,"6382");
        AutoPark autoParc=new AutoPark();
        autoParc.setAutoParc(Arrays.asList(auto,auto1,auto2,auto3));
//        List<Auto> autoParc;
//       autoParc = Arrays.asList(auto,auto1,auto2,auto3);
//        StringWriter sw = new StringWriter();
//        Marshaller.marshal(autoParc, sw);
//        String xmlString = sw.toString();
        JAXBContext context = JAXBContext.newInstance(AutoPark.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(autoParc, new File("file.xml"));
    }
}
