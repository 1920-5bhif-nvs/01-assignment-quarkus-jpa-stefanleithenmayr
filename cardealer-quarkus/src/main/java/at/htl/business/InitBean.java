package at.htl.business;

import at.htl.entity.TestEntity;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class InitBean {

    @Inject
    EntityManager em;

    @Transactional
    void init(@Observes StartupEvent ev){
        TestEntity testEntity = new TestEntity("Stefan Leithenmayr");
        em.persist(testEntity);
    }
}