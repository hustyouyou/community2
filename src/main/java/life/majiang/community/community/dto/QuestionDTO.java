package life.majiang.community.community.dto;

import life.majiang.community.community.model.User;
import lombok.Data;

/**
 * Created by ygq on 2019/12/9 13:09
 */
@Data
public class QuestionDTO {
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
    private User user;
}
