package com.vasylenko.spring.service;

import org.joda.time.LocalDate;
import org.springframework.stereotype.Service;

/**
 * Created by vastl271nko on 08.10.16.
 */
@Service("dateService")
public class DateServiceImpl implements DateService {
    @Override
    public LocalDate getNextAssessmentDate() {
        return new LocalDate(2016, 10, 10);
    }
}
