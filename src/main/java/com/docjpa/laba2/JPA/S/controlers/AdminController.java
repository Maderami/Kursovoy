package com.docjpa.laba2.JPA.S.controlers;

import com.docjpa.laba2.JPA.S.models.Item;
import com.docjpa.laba2.JPA.S.models.ListDocs;
import com.docjpa.laba2.JPA.S.models.User;
import com.docjpa.laba2.JPA.S.repo.ListDocRepository;
import com.docjpa.laba2.JPA.S.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Controller
public class AdminController {
    @Autowired
    private ListDocRepository listdocrepository;
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/console")
    public String documentConsole(Model model) {
        int countusers = (int) usersRepository.count();
        int gencountdocs = (int) listdocrepository.count();
        List<User> users = usersRepository.findAll();
        List<ListDocs> lisd = listdocrepository.findAll();
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            User author = users.get(i);
            int id = listdocrepository.findByName(author.getId_user()).getAuthor().getId_user();
            long count = lisd.stream().filter(x -> x.getAuthor().getId_user() == id).count();
            items.add(i, new Item(author.getFsm_sub(), (int) count));
        }
        model.addAttribute("userC", users);
        model.addAttribute("listU", users);
        model.addAttribute("listd", items);
        model.addAttribute("gencountusers", countusers);
        model.addAttribute("gencountdocs", gencountdocs);

        return "/console/index3";
    }

    @GetMapping("/index2")
    public String documentConsoleDash1(Model model) {
        model.addAttribute("title", "Main console and control pages");
        return "/console/index2";
    }

    @GetMapping("/index3")
    public String documentConsoleDash2(Model model) {
        model.addAttribute("title", "Main console and control pages");
        return "/console/index";
    }

    @GetMapping("/syssett")
    public String documentConsoleSysst(Model model) {
        model.addAttribute("title", "Main console and control pages");
        return "syssett";
    }

    @GetMapping("/webset")
    public String documentConsoleWebst(Model model) {
        model.addAttribute("title", "Main console and control pages");
        return "webset";
    }

    @GetMapping("/controldata")
    public String documentConsoleCondt(Model model) {
        model.addAttribute("title", "Main console and control pages");
        return "controldata";
    }

    @GetMapping("/console/card-doc-control")
    public String documentConsoleAction(Model model) {
        model.addAttribute("title", "Main console and control pages");
        return "/console/card-doc-control";
    }

    @GetMapping("/statcontrol")
    public String statConsoleAction(Model model) {
        model.addAttribute("title", "Main console and control pages");
        return "/console/stat-control";
    }

    @GetMapping("/usersadd")
    public String usersConsoleControlAdd(Model model) {
        model.addAttribute("title", "Main console and control pages");
        return "/console/users-add";
    }

    @GetMapping("/usersview")
    public String usersConsoleControlView(Model model) {
        Iterable<User> listDocs = usersRepository.findAll();
        model.addAttribute("listDocs", listDocs);
        return "/console/users-view";
    }

    @PostMapping("/usersadd")
    public String docAddPost(@RequestParam String fsm_sub, @RequestParam String position, @RequestParam String place_job, @RequestParam String subdivision
            , @RequestParam String phone_sub, @RequestParam String role_sub, @RequestParam String post_address,
                             @RequestParam(required = false, defaultValue = "false") boolean active_acc, Model model) {

        User user = new User(fsm_sub, position, place_job, subdivision, phone_sub, post_address, role_sub, active_acc);
        usersRepository.save(user);
        return "redirect:/console";
    }

    @GetMapping("/userview-edit-{id_user}")
    public String DocumentEdit(@PathVariable(value = "id_user") int id_user, Model model) {
        if (!usersRepository.existsById(id_user)) {
            return "redirect:/usersview";
        }
        Optional<User> listU = usersRepository.findById(id_user);
        ArrayList<User> res = new ArrayList<>();
        listU.ifPresent(res::add);
        model.addAttribute("listUs", res);
        return "/console/userview-edit";
    }

    @PostMapping("/userview-edit-{id_user}")
    public String docUpdatePost(@PathVariable(value = "id_user") int id_user, @RequestParam String fsm_sub, @RequestParam String position, @RequestParam String place_job, @RequestParam String subdivision
            , @RequestParam String phone_sub, @RequestParam String role_sub, @RequestParam String post_address,
                                @RequestParam(required = false, defaultValue = "false") boolean active_acc, Model model) {
        User listU = usersRepository.findById(id_user).orElseThrow();
        listU.setFsm_sub(fsm_sub);
        listU.setSubdivision(subdivision);
        listU.setPosition(position);
        listU.setPlace_job(place_job);
        listU.setPhone_sub(phone_sub);
        listU.setPost_address(post_address);
        listU.setActive_acc(active_acc);
        listU.setRole_sub(role_sub);

        usersRepository.save(listU);
        return "redirect:/usersview";
    }
}
