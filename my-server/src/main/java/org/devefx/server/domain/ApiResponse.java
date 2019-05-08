package org.devefx.server.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * ApiResponse
 *
 * <p>Copyright (C) 上海比捷网络科技有限公司.</p>
 *
 * @author YueYouqian
 * @since 1.0
 */
@Data
@AllArgsConstructor
public class ApiResponse<T> {

    private int code;

    private T data;

}
