/**
 * 
 */
package com.oliver.language;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author Surendra
 *
 */
@ManagedBean
@SessionScoped
public class LanguageController {
	private Map<String, Object> languagemap;
	private LanguageModel languageModel;
	private Language languages;
	
	public LanguageController(){
		languagemap = new LinkedHashMap<String, Object>();	
		for(Language language: languages.values()){
			languagemap.put(language.getLanguage(), language.getLocal());
		}
		languageModel =  new LanguageModel();
	}

	public Map<String, Object> getLanguagemap() {
		return languagemap;
	}

	public LanguageModel getLanguageModel() {
		return languageModel;
	}

	public void setLanguageModel(LanguageModel languageModel) {
		this.languageModel = languageModel;
	}

	
}