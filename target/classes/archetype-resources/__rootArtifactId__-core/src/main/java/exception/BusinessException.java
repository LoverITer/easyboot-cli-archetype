#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.lang.NonNull;
import ${package}.response.ResultCode;

/**
 * @author: frank.huang
 * @date: 2021-11-01 17:41
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BusinessException extends RuntimeException {

    private ResultCode code;

    public BusinessException(@NonNull ResultCode code) {
        this.code = code;
    }

    public BusinessException(@NonNull ResultCode code,String message){
        super(message);
        this.code=code;
    }

    public BusinessException(@NonNull ResultCode code,Throwable cause) {
        super(cause);
        this.code = code;
    }


    public String getCode(){
        return this.code.getCode();
    }

}
