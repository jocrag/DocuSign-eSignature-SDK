package net.docusign.insco.model;

/**
 * Define the possible webservices provided by Docusign, Inc.
 */
public enum WebserviceType {
    DOCUSIGN_WS3_0("ws3_0"),
    CREDENTIAL("credential");
    
    private String typeName;
    
    private WebserviceType(String typeName) {
        this.typeName = typeName;
    }
    
    public String getTypeName() {
        return typeName;
    }
}
