package asd;

import java.util.HashMap;

import asd.domain.BibEntry;
import asd.services.CreateBibEntryService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Initiate the create entry service
        CreateBibEntryService createService = new CreateBibEntryService();

        // Some mocked data for the entry
        Long id = 1l;
        String type = "Journal";
        HashMap<String, String> fields = new HashMap<String, String>(){{ 
            put("year", "2016"); 
            put("journal", "sciencyStuff");
        }};
        boolean changed = false;

        // Magic
        BibEntry entry = createService.createBibEntry(id, type, fields, changed, null);

        //Print the magic
        System.out.println(entry.getId() + "\n" + entry.getType() + "\n" + entry.getFields());
    }
}
