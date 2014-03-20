/**
 * 
 */
package com.oliver.language;

import java.util.Locale;

/**
 * @author Surendra
 * 
 */
public enum Language {
    
    ENGLISH("English", Locale.ENGLISH), GERMAN("Deutsch", Locale.GERMAN);

    private String language;
    private Locale local;

    Language(String language, Locale local) {
	this.language = language;
	this.local = local;
    }

    public String getLanguage() {
	return language;
    }

    public Locale getLocal() {
	return local;
    }
}
