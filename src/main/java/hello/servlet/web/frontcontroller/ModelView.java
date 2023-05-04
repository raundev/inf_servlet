package hello.servlet.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;

/**
 * 이동할 페이지(View)에 대한 정보와 이동할 페이지에 전달할 데이터(Model) 을 담고있는 객체
 */
public class ModelView {
    private String viewName; //이동할 페이지
    private Map<String, Object> model = new HashMap<>(); //이동할 페이지에 전달할 데이터

    public ModelView(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }
}
