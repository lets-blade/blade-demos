package tpl;

import com.blade.exception.TemplateException;
import com.blade.mvc.WebContext;
import com.blade.mvc.http.Request;
import com.blade.mvc.http.Session;
import com.blade.mvc.ui.ModelAndView;
import com.blade.mvc.ui.template.TemplateEngine;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import java.util.Map;

/**
 * Created by hongyb on 2017/12/23.
 */

public class FreeMarkerTemplate implements TemplateEngine {
    private static final String DEFAULT_ENCODING = "UTF-8";

    private Configuration configuration = null;
    public FreeMarkerTemplate() {
        try {
        configuration = new Configuration();
        configuration.setEncoding(Locale.CHINA, DEFAULT_ENCODING);
        String classPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        configuration.setDirectoryForTemplateLoading(new File(classPath+"/templates/"));
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public FreeMarkerTemplate(Configuration configuration) {
        this.configuration = configuration;
    }
    public Configuration getConfiguration(){
        return this.configuration;
    }

    @Override
    public void render(ModelAndView modelAndView, Writer writer) throws TemplateException {
        String view = modelAndView.getView();
        Map<String, Object> model = modelAndView.getModel();
        Request request = WebContext.request();
        Session session = request.session();
        model.putAll(request.attributes());
        if(null != session){
            model.putAll(session.attributes());
        }
        try {
            Template template = configuration.getTemplate(view);
            template.process(model,writer);
        } catch (IOException e) {
            throw new TemplateException(e);
        } catch (freemarker.template.TemplateException e) {
            throw new TemplateException(e);
        }
    }
}
