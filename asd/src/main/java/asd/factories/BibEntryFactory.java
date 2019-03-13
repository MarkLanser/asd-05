package asd.factories;

import asd.domain.BibEntry;
import lombok.NoArgsConstructor;

/**
 * Hello world!
 *
 */
@NoArgsConstructor
public class BibEntryFactory
{
    // Some factory
    public BibEntry createBibEntry() 
    {
        // Some implementation
        return new BibEntry();
    }

}
