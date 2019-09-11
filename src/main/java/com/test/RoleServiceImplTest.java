package com.test;

import com.sy.config.SpringConfig;
import com.sy.model.common.Role;
import com.sy.service.common.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;
@SpringBootTest(classes = SpringConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RoleServiceImplTest {
    @Autowired
    private RoleService roleService;
    @Test
    public void addRole() throws Exception {
        Role role = new Role();
        role.setCreateDate(new Date());
        role.setIsStart(1);
        role.setRoleCode("sl_role02");
        role.setRoleName("会员");
        role.setCreatedBy("admin");
        System.out.println(roleService.addRole(role));
    }

    @Test
    public void getRoleList() {
        try {
            System.out.println(roleService.getRoleList());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}