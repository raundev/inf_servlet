package hello.servlet.web.frontcontroller.v4.controller;

import hello.servlet.web.frontcontroller.v4.ControllerV4;
import java.util.Map;

public class MemberFormControllerV4 implements ControllerV4 {


    //Contoller에서는 requestParameter가 담긴 paramMap과 데이터가 담긴 model만 Map으로 받아 이동할 view의 값을 String으로 전달만 해준다.
    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        return "new-form";
    }
}
