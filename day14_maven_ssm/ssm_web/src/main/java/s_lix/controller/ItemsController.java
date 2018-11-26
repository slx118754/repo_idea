package s_lix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import s_lix.domain.Items;
import s_lix.service.ItemsService;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/showDetail")
    private String showDetail(Model model) {
        Items items = itemsService.findOneById(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }

}
