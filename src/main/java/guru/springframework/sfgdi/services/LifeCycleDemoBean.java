package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    public LifeCycleDemoBean() {
        System.out.println("### Im in the LifecycleBean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("### Bean Factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("### Bean name has set to: " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("### The Lifecycle bean has been terminated.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("### The lifecycle properties has been set.");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("### Application context has been set");
    }

    public void beforeInit() {
        System.out.println("## LifeCycle bean before init");
    }

    public void afterInit() {
        System.out.println("## LifeCycle bean after init");
    }
}
