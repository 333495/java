package org.cfx._01jdbc;

import lombok.*;

/**
 * @author RTX 9090
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;
    private String username;
    private int age;
    private int sex;
}
