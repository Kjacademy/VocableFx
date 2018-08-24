package service;

import service.domain.LinguisticElement;

public interface LinguisticSourceParser {
    LinguisticElement parse(String source);
}
