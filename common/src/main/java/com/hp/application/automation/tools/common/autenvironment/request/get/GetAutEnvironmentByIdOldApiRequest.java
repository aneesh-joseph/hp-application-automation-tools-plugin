package com.hp.application.automation.tools.common.autenvironment.request.get;

import com.hp.application.automation.tools.common.autenvironment.request.AUTEnvironmentResources;
import com.hp.application.automation.tools.common.sdk.Client;
import com.hp.application.automation.tools.common.sdk.request.GeneralGetRequest;

/**
 * Created by barush on 02/11/2014.
 */
public class GetAutEnvironmentByIdOldApiRequest extends GeneralGetRequest {
    
    private String autEnvironmentId;
    
    public GetAutEnvironmentByIdOldApiRequest(Client client, String autEnvironmentId) {
        
        super(client);
        this.autEnvironmentId = autEnvironmentId;
    }
    
    @Override
    protected String getSuffix() {
        
        return AUTEnvironmentResources.AUT_ENVIRONMENTS_OLD;
        
    }
    
    @Override
    protected String getQueryString() {
        
        return String.format("query={id[%s]}", autEnvironmentId);
    }
}
