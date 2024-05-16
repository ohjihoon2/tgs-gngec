package io.tgsinc.tgsgngec.domain.admin.controller;

import io.tgsinc.tgsgngec.global.common.entity.RsrchAsmt;
import io.tgsinc.tgsgngec.global.common.service.RsrchAsmtService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * AdminDevelopController
 * @author ohjihoon
 * @version 1.0.0
 * @date 2024-05-16
 * @description 관리자 연구개발 탭
 */
@Controller
@RequestMapping("/admin/develop")
@RequiredArgsConstructor
public class AdminDevelopController {

    private final RsrchAsmtService rsrchAsmtService;


    /**
     * @methodName adminDevelop
     * @author ohjihoon
     * @date 2024-05-16 오전 11:24
     * @description 연구개발 연구과제 list
     */
    @GetMapping("/research")
    public String adminDevelop(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.DESC) Pageable pageable,
                               String keyword, Model model){
        Page<RsrchAsmt> rsrchAsmtes = rsrchAsmtService.findAll(pageable);

        model.addAttribute("rsrchAsmtes", rsrchAsmtes);

        return "/page/admin/develop/research/index";
    }

    /**
     * @methodName adminDevelopDetail
     * @author ohjihoon
     * @date 2024-05-16 오후 4:43
     * @description 연구개발 연구과제 상세
     */
    @GetMapping("/research/{idx}")
    public String adminDevelopDetail(@PathVariable int idx, Model model){

        model.addAttribute("","");

        return "/page/admin/develop/research/detail";
    }

    //TODO 연구개발 연구과제 등록
    //TODO 연구개발 연구과제 삭제
    //TODO 연구개발 연구과제 수정



    /**
     * @methodName adminDevelopApply
     * @author ohjihoon
     * @date 2024-05-16 오후 4:35
     * @description 연구개발 원문 신청조회 list
     */

    @GetMapping("/aply")
    public String adminDevelopApply(){
        return "/page/admin/develop/original-apply/index";
    }
}
