/**
 * 
 */
package com.oliver.language;

import java.io.Serializable;
import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

/**
 * @author Surendra
 * 
 */
@ManagedBean
@SessionScoped
public class LanguageListener implements Serializable {

    private static final long serialVersionUID = 1L;

    public void createSelectedLanguage(ValueChangeEvent e) {
	String language = e.getNewValue().toString();
	FacesContext.getCurrentInstance().getViewRoot()
		.setLocale(new Locale(language));
    }
}
