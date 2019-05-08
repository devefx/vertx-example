package org.devefx.server.controller.dto;

import lombok.Builder;
import lombok.Data;

/**
 * UserInfo
 *
 * <p>Copyright (C) 上海比捷网络科技有限公司.</p>
 *
 * @author YueYouqian
 * @since 1.0
 */
@Data
@Builder
public class UserInfo {

    private long userId;

    private String email;

    private String username;

}
