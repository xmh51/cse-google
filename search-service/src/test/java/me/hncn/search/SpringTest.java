package me.hncn.search;


import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:search-context.xml"})
public class SpringTest extends AbstractJUnit4SpringContextTests {
    @Before
    public void init(){
       applicationContext= getContext();
    }

    public <T> T getBean(Class<T> type) {
        return applicationContext.getBean(type);
    }

    public Object getBean(String beanName) {
        return applicationContext.getBean(beanName);
    }

    protected ApplicationContext getContext() {
        return applicationContext;
    }
}