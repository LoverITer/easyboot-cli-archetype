#set($symbol_pound='#')
#set($symbol_dollar='$')
#set($symbol_escape='\' )
package ${package}.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import {package}.annotation.ResponseWrapper;
import {package}.bean.UserDetailsBean;
import ${package}.request.CreateUserRequest;
import {package}.request.QueryUserRequest;
import {package}.service.IDemoService;

import javax.xml.ws.ResponseWrapper;
import java.util.List;

/**
 * Example controller
 *
 * @author: frank.huang
 * @date: 2021-10-31 23:08
 */
@RestController
@RequestMapping("/v1/demo")
public class HelathController {

    @ResponseWrapper
    @GetMapping("/")
    public String health() {
        return "success";
    }

}
