package life.majiang.community.community.model;

import lombok.Data;

/**
 * Created by ygq on 2019/12/7 20:29
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
}
