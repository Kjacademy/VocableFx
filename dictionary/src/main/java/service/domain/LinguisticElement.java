package service.domain;

import lombok.Builder;

@Builder
public class LinguisticElement {
    private final String value;
    private final String language;
    private final Meanings meanings;
    private final Meanings foreignMeanings;
}
