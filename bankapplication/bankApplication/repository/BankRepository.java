package com.thinklikepro.bankApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thinklikepro.bankApplication.entity.Account;


@Repository
public interface BankRepository  extends JpaRepository<Account, Long>{

}
