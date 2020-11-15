package belt.craft.orange.springscopedependencyinjection.domain;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class ProxifiedRequestBean {
    private static Integer numberOfProxifiedRequestBeanInstanciated = 0;

    public ProxifiedRequestBean() {
        numberOfProxifiedRequestBeanInstanciated++;
    }

    public Integer getNumberOfProxifiedRequestBeanInstanciated() {
        return numberOfProxifiedRequestBeanInstanciated;
    }
}
