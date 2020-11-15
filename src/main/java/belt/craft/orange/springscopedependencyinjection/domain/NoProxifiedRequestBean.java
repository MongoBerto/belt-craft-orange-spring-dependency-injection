package belt.craft.orange.springscopedependencyinjection.domain;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope(proxyMode = ScopedProxyMode.NO)
public class NoProxifiedRequestBean {
    private static Integer numberOfNoProxifiedRequestBeanInstanciated = 0;

    public NoProxifiedRequestBean() {
        numberOfNoProxifiedRequestBeanInstanciated++;
    }

    public Integer getNumberOfNoProxifiedRequestBeanInstanciated() {
        return numberOfNoProxifiedRequestBeanInstanciated;
    }
}
