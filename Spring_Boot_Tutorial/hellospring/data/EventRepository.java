package com.launchcode.hellospring.data;

import com.launchcode.hellospring.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {


}
