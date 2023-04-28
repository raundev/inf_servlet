package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.springframework.util.StreamUtils;

@WebServlet(name="RequestbodyStringServlet", urlPatterns = "/request-body-string")
public class RequestbodyStringServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Message Body의 내용을 byte코드로 바로 얻을 수 있다.
        //해당방식으로도 읽을 수 있지만 현재는 request.getParameter("ParamName") 형식을 제공하기때문에 해당 방식으로 많이 사용한다.
        ServletInputStream inputStream = request.getInputStream();
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);

        System.out.println("messageBody = " + messageBody);
        response.getWriter().write("OK");

    }
}
