package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Suite {
    String suiteName;
    String parentSuite;
    String description;
    String preconditions;

    public Suite() {

    }
}
