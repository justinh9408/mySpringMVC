package com.hjc.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Classname Not24Exception
 * @Description TODO
 * @Date 2019-12-29 21:10
 * @Created by Justin
 */

@ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "不接收24")
public class Not24Exception extends RuntimeException {

    public Not24Exception() {
        super("24 bad gate way");
    }

}
