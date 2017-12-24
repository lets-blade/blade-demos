package tpl;

import com.blade.Blade;

/**
 * @author biezhi
 * @date 2017/9/28
 */
public class FreeMarkerApplication {

    public static void main(String[] args) {
        Blade.me().start(FreeMarkerApplication.class, args);
    }

}
