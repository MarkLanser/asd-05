package asd.services;

import asd.domain.BibEntry;
import asd.factories.BibEntryFactory;
import asd.repositories.BibEntryRepository;
import lombok.NoArgsConstructor;

/**
 * BibEntry is the aggregate root for this aggregate
 *
 */
@NoArgsConstructor
public class CreateBibEntryService
{
    BibEntryRepository repository = new BibEntryRepository();

    public BibEntry createBibEntry() 
    {
        BibEntry entry = new BibEntryFactory().createBibEntry();
        repository.store(entry);
        return entry;
    }

}
