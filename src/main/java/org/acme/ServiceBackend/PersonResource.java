package org.acme.ServiceBackend;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;


@Path("/Operational")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {

    @Inject
    PersonRepository operationRepository;

    @GET
    public List<PersonEntity> findByStatus(@QueryParam("status") Status status) {
        return operationRepository.findByStatus(status);
    }

    @POST
    @Transactional
    public void createUser(PersonEntity CreateUser) {
        operationRepository.persist(CreateUser);
    }

    @PUT
    @Transactional
    @Path("/{id}")
    public Response updateUser(@PathParam("id") Long id, PersonEntity updatedPersonEntity) {
        PersonEntity existingUser = operationRepository.findById(id);
        if (existingUser == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }if(existingUser.getName() != null) {
            existingUser.setName(updatedPersonEntity.getName());
        }if(existingUser.getStatus() != null) {
            existingUser.setStatus(updatedPersonEntity.getStatus());
        }
        if(existingUser.getStatus() == null || existingUser.getStatus() != Status.Alive || existingUser.getStatus() != Status.Deceased ){
            existingUser.setStatus(updatedPersonEntity.getStatus());
        }
        if(existingUser.getBirthday() != null) {
            existingUser.setBirthday(updatedPersonEntity.getBirthday());
        }
        operationRepository.persist(existingUser);

        return Response.ok(existingUser).build();
    }

    @GET
    public List<PersonEntity> findAll() {
        return operationRepository.listAll();
    }


}
