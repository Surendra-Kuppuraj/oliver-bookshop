/**
 * 
 */
package com.oliver.language;

import java.io.Serializable;

/**
 * @author Surendra
 * 
 */
public class LanguageModel implements Serializable {

    private static final long serialVersionUID = 1987787888L;
    private String languageName;

    public String getLanguageName() {
	return languageName;
    }

    public void setLanguageName(String languageName) {
	this.languageName = languageName;
    }
}
