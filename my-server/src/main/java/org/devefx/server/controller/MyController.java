package org.devefx.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.devefx.server.controller.dto.UserIdRequest;
import org.devefx.server.controller.dto.UserInfo;
import org.devefx.server.domain.ApiRequest;
import org.devefx.server.domain.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * MyController
 *
 * <p>Copyright (C) 上海比捷网络科技有限公司.</p>
 *
 * @author YueYouqian
 * @since 1.0
 */
@Slf4j
@RestController
public class MyController {
    @PostMapping("/private/userInfo")
    public ApiResponse<UserInfo> userInfo(@RequestBody ApiRequest<UserIdRequest> request) {
        final UserIdRequest userIdRequest = request.getBody();
        log.info("userId: {}", userIdRequest.getUserId());
        return new ApiResponse<>(0, UserInfo.builder()
                .userId(userIdRequest.getUserId()).email("devefx@163.com").username("devefx").build());
    }
}
