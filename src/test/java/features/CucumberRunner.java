package features;
import com.intuit.karate.junit5.Karate;
public class CucumberRunner {

    @Karate.Test
    Karate metaWeatherTest(){
        return new Karate().tags("@meta_weather").relativeTo(getClass());
    }
    @Karate.Test
    Karate bookItTest(){
        return new Karate().tags("@bookit").relativeTo(getClass());
    }
}


//https://intuit.github.io/karate/#karate-configjs