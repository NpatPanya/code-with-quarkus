package org.acme.ServiceBackend;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;


@ApplicationScoped
public class PersonRepository implements PanacheRepository<PersonEntity> {

    public List<PersonEntity>findByStatus(Status status) {
        return find("status", status).list();
    }





}
