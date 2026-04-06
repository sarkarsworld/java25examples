
// just importing java.base module, helps us reduce importing multiple explicit imports.
// it reduces the number of imports and logically separating by category like.. base, sql, etc.
import module java.base;
import module java.sql;

/**
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;
**/

public class ModuleImportEx {

    // Some class with complex business logic and hence multiple import statements are required.
    static void main() {
        List<String> names = new ArrayList<>();
        names.add("Alok");
        names.add("Arun");
        names.add("Dinesh");
        names.add("Rohan");

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit( () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            IO.println(Thread.currentThread());
        });

    }
}
