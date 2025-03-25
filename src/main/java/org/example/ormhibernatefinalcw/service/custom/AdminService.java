package org.example.ormhibernatefinalcw.service.custom;

import org.example.ormhibernatefinalcw.dto.AdminDto;
import org.example.ormhibernatefinalcw.service.SuperService;

public interface AdminService extends SuperService{

    Boolean addNewAdmin(AdminDto adminDto) throws Exception;

}
