package com.bladejava.demo.test;

import com.blade.test.BladeApplication;
import com.blade.test.BladeTestRunner;
import com.bladejava.demo.TestApplication;
import org.junit.runner.RunWith;

/**
 * @author biezhi
 * @date 2018/5/31
 */
@RunWith(BladeTestRunner.class)
@BladeApplication(TestApplication.class)
public abstract class BaseTest {

}
