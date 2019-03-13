package asd.domain;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * BibEntryGroup is the aggregate root for this aggregate
 *
 */
@NoArgsConstructor
@AllArgsConstructor
public class BibEntryGroup
{
    private long id;
    private String type;
    private ArrayList<BibEntry> bibEntries;

}
