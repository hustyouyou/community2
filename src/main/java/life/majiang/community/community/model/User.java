package life.majiang.community.community.model;

import lombok.Data;

/**
 * Created by ygq on 2019/12/6 21:17
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
