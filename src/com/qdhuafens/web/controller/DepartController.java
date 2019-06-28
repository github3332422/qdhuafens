package com.qdhuafens.web.controller;

import com.qdhuafens.web.entity.Depart;
import com.qdhuafens.web.service.DepartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @program: Huafens
 * @description: 部门管理控制器
 * @author: 张清
 * @create: 2019-06-24 08:49
 **/
//@RequestMapping("/depart")
@Controller
public class DepartController {
    @Resource
    private DepartService departService;

    public void setDepartService(DepartService departService) {
        this.departService = departService;
    }

    /**
     * 查看所有部门
     * */
    @RequestMapping("/depart")
    public String showAllDepart(Model model, HttpSession session){
        List<Depart> departs = departService.querryAllDepart();
        model.addAttribute("departs",departs);
        return "list_depart";
    }
//
//    /**
//     * 删除用户
//     * */
//    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
//    public String deleteEmp(@PathVariable("id")Integer id ) {
//        //删除员工
//        departService.deleteDepart(id);
////        departService.deleteEmployer(id);
//        //重定向到列表
//        return "redirect:/list_depart";
//    }

    /**
     * 删除单个部门
     * */
    @RequestMapping(value="/delete")
    public String deleteEmp(Integer id ) {
        Integer t = departService.deleteDepart(id);
        if(t > 0){
            return "OK";
        }
        else{
            return "FaIL";
        }
    }

    /**
     * 删除多个部门
     * */

    /**
     * 修改部门: 去往修改页面
     */
    @RequestMapping(value="/update/{id}",method=RequestMethod.GET)
    public String  toUpdatePage(@PathVariable("id")Integer id, Map<String,Object> map ) {
        //查询要修改的部门信息
        Depart depart = departService.qurryById(id);
        System.out.println(depart);
        map.put("depart", depart);
        //去往修改页面
        return "update_depart";
    }

}
