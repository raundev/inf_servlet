package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;
import java.util.Map;

/**
 * HttpServletRequest, HttpServletResponse 대한 처리는 더이상 컨트롤러에서 직접 하지 않는다.
 */
public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);

}
