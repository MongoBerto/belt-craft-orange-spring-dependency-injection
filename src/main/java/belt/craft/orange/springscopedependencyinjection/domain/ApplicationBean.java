package belt.craft.orange.springscopedependencyinjection.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
@RequiredArgsConstructor
public class ApplicationBean {

    private final ProxifiedRequestBean proxifiedRequestBean;
    private final NoProxifiedRequestBean noProxifiedRequestBean;

    public Integer getNumberOfProxifiedRequestBeanInstanciated() {
        return proxifiedRequestBean.getNumberOfProxifiedRequestBeanInstanciated();
    }

    public Integer getNumberOfNoProxifiedRequestBeanInstanciated() {
        return noProxifiedRequestBean.getNumberOfNoProxifiedRequestBeanInstanciated();
    }
}
