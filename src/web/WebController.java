package web;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author tony.chenjy
 * @date 2020-06-20
 */
public class WebController implements Initializable {

    @FXML
    private WebView webView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        final WebEngine webengine = webView.getEngine();
//        String url = SampleApplication.class.getResource("/html/index.html").toExternalForm();
        String url = "https://www.baidu.com/";
        webengine.load(url);
    }

}
