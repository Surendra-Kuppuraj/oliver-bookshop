/**
 * 
 */
package com.oliver.navigation;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

import com.oliver.constants.AuthorNavigation;
 
/**
 * @author Surendra
 * 
 */
@ManagedBean
public class AuthorNavigationController {
    private Map<String, String> authorNaviagationMap;
    private AuthorNavigation authorNavigations;

    public AuthorNavigationController() {
		authorNaviagationMap = new LinkedHashMap<String, String>();
		for (AuthorNavigation adminNavigation : authorNavigations.values()) {
			authorNaviagationMap.put(adminNavigation.getLinkName(),
					adminNavigation.getLinkURI());
		}
	}

    
    public Map<String, String> getAuthorNaviagationMap() {
        return authorNaviagationMap;
    }

    
    public void setAuthorNaviagationMap(Map<String, String> authorNaviagationMap) {
        this.authorNaviagationMap = authorNaviagationMap;
    }

}
