package life.majiang.community.community.dto;

import lombok.Data;

/**
 * Created by ygq on 2019/12/6 13:30
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
