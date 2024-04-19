/**
 * 
 */
package com.meportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.meportal.model.Address;


@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {
	@Query("from Address d where d.address=:address")
	public Address findAddressByName(@Param("address") String address);
}
