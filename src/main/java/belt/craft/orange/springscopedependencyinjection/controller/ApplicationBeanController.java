package belt.craft.orange.springscopedependencyinjection.controller;

import belt.craft.orange.springscopedependencyinjection.domain.ApplicationBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationBeanController {

    @Autowired
    private ApplicationBean applicationBean;

    @GetMapping("/proxified-request-bean")
    ResponseEntity<Integer> getNumberOfProxifiedRequestBeanInstanciated() {
        return new ResponseEntity<>(applicationBean.getNumberOfProxifiedRequestBeanInstanciated(), HttpStatus.OK);
    }

    @GetMapping("/no-proxified-request-bean")
    ResponseEntity<Integer> getNumberOfNoProxifiedRequestBeanInstanciated() {
        return new ResponseEntity<>(applicationBean.getNumberOfNoProxifiedRequestBeanInstanciated(), HttpStatus.OK);
    }
}
