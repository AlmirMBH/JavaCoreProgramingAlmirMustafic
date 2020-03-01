package advancedJavaSix;

public enum ConnectionEnum {
    URL("jdbc..."),
    PASSWORD("password"),
    USERNAME("root");
    
    private final String field;

    private ConnectionEnum(String field) {
        this.field = field;
    }
public String get(){
    return field;
}    
    
    
}
