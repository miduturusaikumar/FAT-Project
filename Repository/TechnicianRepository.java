package com.FAT.backendDB.Repository;

import com.FAT.backendDB.Model.Technicians;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicianRepository extends JpaRepository<Technicians,Long> {


}

