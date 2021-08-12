/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.passcop.source.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;

import com.passcop.source.dao.MemberDao;
import com.passcop.source.model.Member;

// The @Model stereotype is a convenience mechanism to make this a request-scoped bean that has an
// EL name
// Read more about the @Model stereotype in this FAQ:
// http://www.cdi-spec.org/faq/#accordion6 
@Named
@ViewScoped
public class MemberController extends AbstractController<Member> {

	private static final long serialVersionUID = 1L;
	
	@Inject
	@SuppressWarnings("unused")
	private Logger log;

	@Inject
	private FacesContext facesContext;

	@Inject
	private MemberDao memberDao;  
	
	public MemberController() {
		super(Member.class,false);
	}
	
	@Override
	public String onload(boolean mustList) {
		setItems(new ArrayList(0));
		setSelected(new Member());
		if (mustList) {
			find();
			log.info("Listando registros, encontrados "+getItems().size());
		}
		return null;
	}

	@Override
	public void find() {
		if (isPaginationEnabled()) {
		}
		else {
			setItems(memberDao.findAll());
		}

	}

	@Override
	public void retrieveResultsPage() {
		// TODO Auto-generated method stub

	}

	@Override
	public long getItemsCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void filterAction(ActionEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveAction(ActionEvent event) {
		
	}
	
	public void save() {
		try {
			memberDao.save(getSelected());
			facesContext.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Registered!", "Registration successful"));
			find();
		} catch (Exception e) {
			String errorMessage = getRootErrorMessage(e);
			FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_ERROR, errorMessage, "Registration Unsuccessful");
			facesContext.addMessage(null, m);
		}
	}

	@Override
	public void deleteAction(ActionEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void goEdit(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void goList() {
		// TODO Auto-generated method stub

	}
	
	private String getRootErrorMessage(Exception e) {
        // Default to general error message that registration failed.
        String errorMessage = "Registration failed. See server log for more information";
        if (e == null) {
            // This shouldn't happen, but return the default messages
            return errorMessage;
        }

        // Start with the exception and recurse to find the root cause
        Throwable t = e;
        while (t != null) {
            // Get the message from the Throwable class instance
            errorMessage = t.getLocalizedMessage();
            t = t.getCause();
        }
        // This is the root cause message
        return errorMessage;
    }
}
