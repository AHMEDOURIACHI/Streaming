
package streaming.test;

import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class StreamingTest {
     @Test 
       public void Test() {
         
        Persistence.createEntityManagerFactory("PU");
    }
    
}
