package org.jsp.stocks.Repository;

import java.util.Optional;

import org.jsp.stocks.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{

	boolean existsBymail(String mail);

	boolean existsByMobile(long mobile);

	Optional<User> findBymail(String mail);

}