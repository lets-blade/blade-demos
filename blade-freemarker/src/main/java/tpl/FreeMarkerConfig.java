package tpl;

import com.blade.Blade;
import com.blade.event.BeanProcessor;
import com.blade.ioc.annotation.Bean;

/**
 * Created by Administrator on 2017/12/24.
 */
@Bean
public class FreeMarkerConfig  implements BeanProcessor{
    @Override
    public void processor(Blade blade) {
        blade.templateEngine(new FreeMarkerTemplate());
    }
}
