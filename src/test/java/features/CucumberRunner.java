package features;
import com.intuit.karate.junit5.Karate;
public class CucumberRunner {

    @Karate.Test
    Karate metaWeatherTest(){
        return new Karate().tags("@meta_weather").relativeTo(getClass());
    }
}
