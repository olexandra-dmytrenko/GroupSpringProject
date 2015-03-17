package com.models.services;

import com.models.forms.Form;
import com.models.persistance.FormRepository;

import java.util.ArrayList;
import java.util.List;


public class FormServiceImpl implements FormService {

    private final FormRepository forms;

    public FormServiceImpl(FormRepository forms) {
        this.forms = forms;
    }


    @Override
    public void addForm(String user, Form form) {
        List<Form> userForms = forms.getForms().get(user);
        if(userForms == null){
            userForms = new ArrayList<>();
        }
        userForms.add(form);
        forms.getForms().put(user, userForms);
    }
}
