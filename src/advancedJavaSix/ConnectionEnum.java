package advancedJavaSix;

public enum ConnectionEnum {
    URL("jdbc:mysql://localhost:3306/my_database"),
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
