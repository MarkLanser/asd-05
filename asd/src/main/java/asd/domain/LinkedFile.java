package asd.domain;

import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * LinkedFile is a value object, lombok takes care of this contract by the @value notation
 *
 */
@AllArgsConstructor
@Value
public class LinkedFile
{
    private String description;
    private String link;
    private String fileType;

}
