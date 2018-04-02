package org.boxtree.repositories;


import org.boxtree.models.Place;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "places", path = "places")
public interface PlaceRepository extends CrudRepository<Place, Long> {

}
