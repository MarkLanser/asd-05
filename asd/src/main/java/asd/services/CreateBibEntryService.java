package asd.services;

import asd.domain.BibEntry;
import asd.domain.LinkedFile;
import asd.factories.BibEntryFactory;
import asd.repositories.BibEntryRepository;
import lombok.NoArgsConstructor;
import java.util.Map;

/**
 * The service for creating an entry
 *
 */
@NoArgsConstructor
public class CreateBibEntryService
{
    BibEntryRepository repository = new BibEntryRepository();

    public BibEntry createBibEntry(Long id, String type, Map<String, String> fields, boolean changed, LinkedFile linkedFile) 
    {
        BibEntry entry = new BibEntryFactory().createBibEntry(id, type, fields, changed, linkedFile);
        repository.store(entry);
        return entry;
    }
}
