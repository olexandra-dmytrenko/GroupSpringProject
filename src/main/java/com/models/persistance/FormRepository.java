package com.models.persistance;

import com.models.forms.Form;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FormRepository {

    private Map<String, List<Form>> forms = new ConcurrentHashMap<>();

    public Map<String, List<Form>> getForms() {
        return forms;
    }
}
