package com.hp.application.automation.tools.common.autenvironment.request.get;

import com.hp.application.automation.tools.common.autenvironment.request.AUTEnvironmentResources;
import com.hp.application.automation.tools.common.sdk.Client;
import com.hp.application.automation.tools.common.sdk.request.GeneralGetRequest;

/**
 * Created by barush on 02/11/2014.
 */
public class GetAutEnvFoldersByIdRequest extends GeneralGetRequest {
    
    private String folderId;
    
    public GetAutEnvFoldersByIdRequest(Client client, String folderId) {
        
        super(client);
        this.folderId = folderId;
    }
    
    @Override
    protected String getSuffix() {
        
        return AUTEnvironmentResources.AUT_ENVIRONMENT_PARAMETER_FOLDERS;
    }
    
    @Override
    protected String getQueryString() {
        
        return String.format("query={id[%s]}&page-size=2000", folderId);
    }
}
