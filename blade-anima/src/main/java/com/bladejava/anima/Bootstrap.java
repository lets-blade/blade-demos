package com.bladejava.anima;

import com.alibaba.druid.pool.DruidDataSource;
import com.hellokaton.blade.Blade;
import com.hellokaton.blade.ioc.annotation.Bean;
import com.hellokaton.blade.loader.BladeLoader;
import com.hellokaton.anima.Anima;

/**
 * 启动加载项
 *
 * @author biezhi
 * @date 2022/5/3
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
