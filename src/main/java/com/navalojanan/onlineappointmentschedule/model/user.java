@package packageName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class User {

    @Id
    @GeneratedValue
    private Long id;

    private String userName;

    private String firstName;

    private String lastName;

    private String email;

    
}
