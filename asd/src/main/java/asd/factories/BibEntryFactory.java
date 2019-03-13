package asd.factories;

import asd.domain.BibEntry;
import asd.domain.LinkedFile;
import lombok.NoArgsConstructor;
import java.util.Map;

/**
 * Hello world!
 *
 */
@NoArgsConstructor
public class BibEntryFactory
{
    // Some factory
    public BibEntry createBibEntry(Long id, String type, Map<String, String> fields, boolean changed, LinkedFile linkedFile) 
    {
        // Some implementation
        return new BibEntry(id, type, fields, changed, linkedFile);
    }

}
