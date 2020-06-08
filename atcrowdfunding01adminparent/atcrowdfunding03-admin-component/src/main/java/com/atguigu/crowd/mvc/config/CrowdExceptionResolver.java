package com.atguigu.crowd.mvc.config;

import com.ccctop.crowd.constant.CrowdConstant;
import com.ccctop.crowd.exception.LoginAcctAlreadyInUseException;
import com.ccctop.crowd.exception.LoginAcctAlreadyInUseForUpdateException;
import com.ccctop.crowd.exception.LoginFaildException;
import com.ccctop.crowd.util.CrowdUtil;
import com.ccctop.crowd.util.ResultEntity;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * 表示当前是一个基于注解异常处理器类
 * */
@ControllerAdvice
public class CrowdExceptionResolver {
    @ExceptionHandler(value = LoginAcctAlreadyInUseException.class)
    public ModelAndView resolveLoginAcctAlreadyInUseException(LoginAcctAlreadyInUseException exception, HttpServletRequest request, HttpServletResponse response) {
        String viewName = "admin-add";
        //返回
        return commonResolve(viewName, exception, request, response);
    }

    @ExceptionHandler(value = LoginAcctAlreadyInUseForUpdateException.class)
    public ModelAndView resolveLoginAcctAlreadyInUseForUpdateException(LoginAcctAlreadyInUseForUpdateException exception, HttpServletRequest request, HttpServletResponse response) {
        String viewName = "system-error";
        //返回
        return commonResolve(viewName, exception, request, response);
    }


    @ExceptionHandler(value = LoginFaildException.class)
    public ModelAndView resolveLoginFaildException(LoginFaildException exception, HttpServletRequest request, HttpServletResponse response) {
        String viewName = "admin-login";
        //返回
        return commonResolve(viewName, exception, request, response);
    }


    @ExceptionHandler(value = ArithmeticException.class)
    public ModelAndView resolveMathException(ArithmeticException exception, HttpServletRequest request, HttpServletResponse response) {
        String viewName = "system-error";
        //返回
        return commonResolve(viewName, exception, request, response);
    }

    //将一个具体异常类型与一个方法关联起来
    @ExceptionHandler(value = NullPointerException.class)
    public ModelAndView resolveNullPointerException(NullPointerException exception,
                                                    HttpServletRequest request,
                                                    HttpServletResponse response) {
        String viewName = "system-error";
        return commonResolve(viewName, exception, request, response);
    }
    @ExceptionHandler(value = Exception.class)
    public ModelAndView resolveException(Exception exception,
                                                    HttpServletRequest request,
                                                    HttpServletResponse response) {
        String viewName = "admin-login";
        return commonResolve(viewName, exception, request, response);
    }


    private ModelAndView commonResolve(String viewName, Exception exception, HttpServletRequest request, HttpServletResponse response) {
        //获取异常消息
        String message = exception.getMessage();

        //1.判断当前请求的类型
        boolean judgeResult = CrowdUtil.judgRequestType(request);
        //2.如果是一个ajax请求
        if (judgeResult) {
            //3.创建ResultEntity对象
            ResultEntity<Object> failed = ResultEntity.failed(message);
            //4.创建Gson对象
            Gson gson = new Gson();
            //5.将对象转换为Json字符串
            String json = gson.toJson(failed);
            //6.将Json字符串作为响应体返回给浏览器
            try {
                response.getWriter().write(json);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //7.由于上面已经通过原生response对象返回了响应，所以不提供ModelAndView对象
            return null;
        }
        //不是ajax请求
        ModelAndView modelAndView = new ModelAndView();
        //1.将exception对象存入模型
        modelAndView.addObject(CrowdConstant.ATTR_NAME_EXCEPTION, exception);
        //2.设置对应视图
        modelAndView.setViewName(viewName);
        return modelAndView;
    }

}
