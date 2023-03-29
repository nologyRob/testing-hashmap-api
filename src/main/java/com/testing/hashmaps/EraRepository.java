package com.testing.hashmaps;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EraRepository extends JpaRepository<Era,Long> {

}
