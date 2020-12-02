package AnnoExa_Two;

import lombok.Data;

@Data
public class User {
    
    @MyConstraint(min = 1,max = 1)
    
    private String name;
    private String address;
}
