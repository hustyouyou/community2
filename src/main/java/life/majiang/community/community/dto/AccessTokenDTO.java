package life.majiang.community.community.dto;

import lombok.Data;

/**
 * Created by ygq on 2019/12/6 12:22
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
