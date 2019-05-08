package org.devefx.server.domain;

import lombok.Data;

/**
 * ApiRequest
 *
 * <p>Copyright (C) 上海比捷网络科技有限公司.</p>
 *
 * @author YueYouqian
 * @since 1.0
 */
@Data
public class ApiRequest<T> {

    private String trackingChain;

    private String domain;

    private String language;

    private String terminal;

    private T body;

}
