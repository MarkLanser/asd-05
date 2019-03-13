package asd.domain;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * BibEntry is the aggregate root for this aggregate
 *
 */
@NoArgsConstructor
@AllArgsConstructor
public class BibEntry
{
    private long id;
    private String type;
    private Map<String, String> fields;
    private boolean changed;
    private LinkedFile linkedFile;

}
