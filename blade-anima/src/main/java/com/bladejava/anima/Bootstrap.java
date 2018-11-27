package com.bladejava.anima;

import com.alibaba.druid.pool.DruidDataSource;
import com.blade.Blade;
import com.blade.ioc.annotation.Bean;
import com.blade.loader.BladeLoader;
import io.github.biezhi.anima.Anima;

/**
 * 启动加载项
 *
 * @author biezhi
 * @date 2018/6/21
 */
@Bean
public class Bootstrap implements BladeLoader {

    @Override
    public void load(Blade blade) {
        // JDBC
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(blade.environment().getOrNull("jdbc.url"));
        dataSource.setUsername(blade.environment().getOrNull("jdbc.username"));
        dataSource.setPassword(blade.environment().getOrNull("jdbc.password"));

        Anima.open(dataSource);
    }

}
